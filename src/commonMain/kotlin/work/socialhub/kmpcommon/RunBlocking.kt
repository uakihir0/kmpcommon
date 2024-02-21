package work.socialhub.kmpcommon

import kotlinx.coroutines.CoroutineScope

var JsRunBlockingTimeoutSec = 30

expect fun <T> runBlocking(block: suspend CoroutineScope.() -> T): T