package work.socialhub.kmpcommon

import kotlinx.datetime.Clock
import kotlinx.datetime.TimeZone
import kotlin.test.Test

class DateFormatterTest {

    @Test
    fun testFormat() {
        val date = DateFormatter(
            "yyyy-MM-ddTHH:mm:ssZ",
            TimeZone.UTC
        )
        println(date.format(Clock.System.now()))
    }
}