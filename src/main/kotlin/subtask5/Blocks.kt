package subtask5

import org.omg.CORBA.ORB.init
import java.time.LocalDate
import kotlin.reflect.KClass

class Blocks {

    // TODO: Complete the following function
    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {

        //throw NotImplementedError("Not implemented")
        //var intro: Array<Any> = blockA as Array<Any>
        var blockC: KClass<Any>

        when (blockB) {
            String::class->{
                var res = blockA.filterIsInstance<String>()
                return res.toString()
            }
            Int::class->{
                var res = blockA.filterIsInstance<Int>()
                return res.sum()
            }
            LocalDate::class->{
                var res = blockA.filterIsInstance<LocalDate>()
                return res
            }
        }
        return blockA
    }
}