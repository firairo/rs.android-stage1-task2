package subtask3

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
        val a=a.toUpperCase()
        val b=b

        val CHa: CharArray = a.toCharArray()
        val CHb: CharArray= b.toCharArray()
        var i:Int=0
        var x:Int=0
        val ar: CharArray = CharArray(CHb.size)

        while (i<a.length)
            if (x<ar.size&&CHa[i]==CHb[x]){
                ar[x]=CHb[x]
                x++
                i++}
        else
            i++
        i=0

        while (i<ar.size)
        if (CHb[i]==ar[i])
            i++
        else
        return "NO"

        return "YES"
    }
}
