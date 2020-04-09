package subtask1

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

class DateFormatter {

    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {
        val dayInt = day.toInt()
        val monthInt = month.toInt()
        val yearInt = year.toInt()
            return try {
                val localDate = LocalDate.of(yearInt, monthInt, dayInt)
                val locale = Locale("ru")
               localDate.format(DateTimeFormatter.ofPattern("dd MMMM, EEEE", locale))
            } catch (e: Exception) {
                "Такого дня не существует"
            }
        }
}
