package subtask5

import org.omg.CORBA.ORB.init
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.reflect.KClass

class Blocks {

    // TODO: Complete the following function
    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
        when (blockB) {
            String::class->{
                var res = blockA.filterIsInstance<String>().joinToString ("")
                return res
            }
            Int::class->{
                var res = blockA.filterIsInstance<Int>()
                return res.sum()
            }
            LocalDate::class->{
                var res = blockA.filterIsInstance<LocalDate>().max()!!.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))
                return res
            }
        }
        return blockA
    }
}