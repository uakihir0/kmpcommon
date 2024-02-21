package work.socialhub.kmpcommon

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.datetime.Clock

/**
 * Kotlin/JS では runBlocking が使えないため GlobalScope.launch でスコープを起動
 */
actual fun <T> runBlocking(block: suspend CoroutineScope.() -> T): T {

    var result: T? = null
    @Suppress("OPT_IN_USAGE")
    val job = GlobalScope.launch { result = block() }

    // 開始時刻を記録
    val start = Clock.System.now().toEpochMilliseconds()

    // 完了するまで無限ループで待機
    while (!job.isCompleted) {
        val now = Clock.System.now().toEpochMilliseconds()
        if (now - start > (JsRunBlockingTimeoutSec * 1000)) {
            job.cancel()
            throw IllegalStateException("blocking timeout")
        }
    }

    return checkNotNull(result)
}
