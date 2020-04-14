package subtask4

class Pangram {

    // TODO: Complete the following function
    fun getResult(inputString: String): String {
        //throw NotImplementedError("Not implemented")
        var words = inputString.split(" ").toMutableList()
        var i=0
        var j=0
        var x = 0
        var g = 0
        val arr = charArrayOf('a', 'e', 'i', 'o', 'u', 'y')

        while (i < words.size) {
            while (x < words[i].length) {
                while (j < arr.size) {
                    if (arr[j] in words[i]) {
                        var a = words[i].replace(arr[j], arr[j].toUpperCase())
                        words[i] = a
                        g++
                        x++
                        j++
                    } else {
                        j++
                        x++
                    }
                }
                var b=g.toString()+words[i]
                words[i]=b
                i++
                j = 0
                g = 0
            }
            x = 0
        }
        return words.toString()
    }
}