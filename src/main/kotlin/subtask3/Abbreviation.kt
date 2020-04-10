package subtask3

import kotlin.system.exitProcess

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
        val AA = a.toUpperCase()
        val result = mutableListOf<String>()
        for(char1 in AA){
            for(char2 in b){
                if (char1 == char2) {
                    result.add(char1.toString())
                }
            }
        }
        println(result)
        val res = mutableListOf<String>()
        for (char in b) {
            res.add(char.toString())
        }
        println(res)
        if (result == res) {
            return "YES"
        } else {
            return "NO"
        }
        //throw NotImplementedError("Not implemented")
    }
}
