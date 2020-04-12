package subtask6

class Fibonacci {

    // TODO: Complete the following function
    fun productFibonacciSequenceFor(n: Int): IntArray {
        var a = 0
        var b = 1
        var result = 0
        while ((a*b) < n) {
            val sum = a + b
            a = b
            b = sum
            if (a*b == n) {
                result = 1
                break
            }
        }
        return arrayOf(a, b, result).toIntArray()
        //throw NotImplementedError("Not implemented")
    }
}
