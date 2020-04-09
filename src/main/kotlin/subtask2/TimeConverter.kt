package subtask2

class TimeConverter {

    // TODO: Complete the following function
    fun toTextFormat(hour: String, minute: String):String {
        val time = arrayOf(
            "one", "two", "three", "four", "five", "six",
            "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen",
            "sixteen", "seventeen", "eighteen", "nineteen", "twenty", "twenty one",
            "twenty two", "twenty three", "twenty four", "twenty-five", "twenty six",
            "twenty seven", "twenty eight"
        )
        val m = minute.toInt()
        val h = hour.toInt()
        var result = ""
         when (m) {
            0 -> result = "${time[h - 1]} o' clock"
            1 -> result = "${time[m - 1]} minute past ${time[h - 1]}"
            in 2..14, in 16..29 -> result = "${time[m - 1]} minutes past ${time[h - 1]}"
            15 -> result = "quarter past ${time[h - 1]}"
            30 -> result = "half past ${time[h - 1]}"
            31 -> result = "${time[m - 1]} minute to ${time[h - 1]}"
            in 32..44, in 46..59 -> result = "${time[59 - m]} minutes to ${time[h]}"
            45 -> result = "quarter to ${time[h]}"
        }
        println(result)
        return result
        //throw NotImplementedError("Not implemented")
    }
}
