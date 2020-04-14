package subtask6

class Fibonacci {

    // TODO: Complete the following function
    fun productFibonacciSequenceFor(n: Int): IntArray {
        var n = n

        var n0: Int = 0
        var n1: Int = 1
        var n2: Int = 1

        var mas: IntArray = IntArray(100)
        var final: IntArray = IntArray(3)
        var i = 2
        mas[0] = 0
        mas[1] = 1
        while (i < 100) {
            n2 = n1 + n0
            n0 = n1
            n1 = n2
            mas[i] = n2
            i++
        }
        i = 0
        if (n >= mas[i] * mas[i + 1]) {
        while (i < 100 && final[2] == 0) {

                if (n == (mas[i] * mas[i + 1])) {
                    final[0] = mas[i]
                    final[1] = mas[i + 1]
                    final[2] = 1
                } else {
                    final[2] = 0
                    i++
                }}}
            else
                final[0] = mas[i] * mas[i - 1]
                final[1] = mas[i - 1]
                final[2] = 0

        return final
    }}
