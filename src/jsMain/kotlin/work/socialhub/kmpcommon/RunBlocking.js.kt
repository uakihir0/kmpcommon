package work.socialhub.kmpcommon

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.promise

/**
 * Kotlin/JS では runBlocking が使えないため GlobalScope.promise でスコープを起動
 * (この場合、返却される型が T -> Promise<T> となるが、JavaScript のレイヤーで吸収する)
 */
actual fun <T> runBlocking(block: suspend CoroutineScope.() -> T): dynamic {
    @Suppress("OPT_IN_USAGE")
    return GlobalScope.promise { block() }
}
