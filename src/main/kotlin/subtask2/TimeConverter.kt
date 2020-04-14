package subtask2

import java.util.*

class TimeConverter {

    // TODO: Complete the following function
    fun toTextFormat(hour: String, minute: String): String {
        val h=hour.toInt()
        val m=minute.toInt()
        var i=""

        val hourNum:Array<String> = arrayOf(
            "zero",
            "one",
            "two",
            "three",
            "four",
            "five",
            "six",
            "seven",
            "eight",
            "nine",
            "ten",
            "eleven",
            "twelve",
            "thirteen",
            "fourteen",
            "fifteen",
            "sixteen",
            "seventeen",
            "eighteen",
            "nineteen",
            "twenty",
            "twenty one",
            "twenty two",
            "twenty three",
            "twenty four",
            "twenty five",
            "twenty six",
            "twenty seven",
            "twenty eight",
            "twenty nine"

        )
        if (h <= 24 && m <= 60) {
            if (m == 0) {
                i = hourNum[h] + " o' clock"
                return i
            }
            if (m == 1) {
                i = "one minute past " + hourNum[h]
                return i
            }
            if (m == 59) {
                i = "one minute to " + hourNum[(h % 12) + 1]
                return i
            }
            if (m == 15) {
                i = "quarter past " + hourNum[h]
                return i
            }
            if (m == 45) {
                i = "quarter to " + hourNum[(h % 12) + 1]
                return i
            }
            if (m == 30) {
                i = "half past " + hourNum[h]
                return i
            }
            if (m < 30) {
                i = hourNum[m] + " minutes past " + hourNum[h]
                return i
            }
            if (m > 30) {
                i = hourNum[60 - m] + " minutes to " + hourNum[(h % 12) + 1]
                return i
            }
        }
        else {
            return i
        }

        return i
    }
}
