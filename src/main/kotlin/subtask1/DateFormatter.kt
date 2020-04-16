package subtask1




import java.text.SimpleDateFormat
import java.util.*
import java.util.Calendar.*


class DateFormatter {

    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {
        var day=day.toInt()
        var month = month.toInt()
        var year=year.toInt()


        var Cal: Calendar =Calendar.getInstance(Locale("RU"))
        Cal.set(year,month-1,day)

        var SimpleDateFormat: SimpleDateFormat = SimpleDateFormat("dd MMMM, EEEE")
        var final =SimpleDateFormat.format(Cal.getTime())
        if (final.toString().startsWith(day.toString())) {
            return final.toString()
        }
        else {
            return "Такого дня не существует"
        }
    }
}

