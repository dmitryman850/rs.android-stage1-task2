package subtask4

class Pangram {

    // TODO: Complete the following function
    fun getResult(inputString: String): String {
        val vowels = setOf<String>("a","e","i","o","u","y")
            val vowels10 = setOf<String>("a","e","i","o","u","y","q","w","r","t","p","s","d","f","g","h",
            "j","k","l","z","x","c","v","b","n","m")
        val vowels2 = setOf<String>("Q","W","R","T","P","S","D","F","G","H",
            "J","K","L","Z","X","C","V","B","N","M")
        println(vowels)
        var strsresult: List<String>
        var inp = mutableListOf<String>()
        var inp2 = arrayListOf<String>()
        println(inp)
        var strs = (inputString.split(" ").toTypedArray())

        if(strs[0] == "") {
            strsresult = strs.drop(1)
            println("Проверка ${strsresult[0]}")
        } else {
            strsresult = strs.toList()
        }
        println("str ${strs[0]}")
        var strs2 = strsresult.toMutableList()
        println(strs2)
        var iny = 0
        var count = 0
        println(strs2[0])
        println("проверка на наличие нужного количества гласных в предложении")
        for (i in inputString) {
            for (a in vowels10) {
                if (i.toString().toLowerCase() == a) {
                    inp.add(i.toString().toLowerCase())
                }
            }
        }
        println(inp)
        if (inp.toSet() == vowels10) {
            //pangram
            println("подсчёт количества гласных в каждом слове")
            while (iny < strsresult.size) {
                for (i in strs2[iny]) {
                    for (a in vowels) {
                        if (i.toString() == a) {
                            count++
                        }
                    }
                }
                inp2.add("$count${strs2[iny]}")
                iny++
                count = 0
            }
            println("После цикла")
            println(inp2)
            inp2.sortBy{it[0]}
            println(inp2)
            println("После цикла 2")
            var frd = inp2.toString()
            var frd1 = frd.substringAfter("[")
            println(frd1)
            var frd2 = frd1.substringBefore("]")
            println(frd2)
            var result = frd2.replace(Regex("[aeiouy]")) {
                when(it.value) {
                    "a" -> "A"
                    "e" -> "E"
                    "i" -> "I"
                    "o" -> "O"
                    "u" -> "U"
                    "y" -> "Y"
                    else -> it.value
                }
            }
            var result5 = result.replace(Regex(", ")) {
                when(it.value) {
                    ", " -> " "
                    else -> it.value
                }
            }
            println(result)
            println(result5)
            return result5
        } else if(inputString == "                     ") {
            return ""
        }
        else {
            println("подсчёт количества согласных в слове")
            while (iny < strsresult.size) {
                for (i in strs2[iny]) {
                    for (a in vowels2) {
                        if (i.toString().toUpperCase() == a) {
                            count++
                        }
                    }
                }
                inp2.add("$count${strs2[iny]}")
                iny++
                count = 0
            }
            println("После цикла")
            println(inp2)
            inp2.sortBy { it[0] }
            println(inp2)
            println("После цикла 2")
            var frd = inp2.toString()
            var frd1 = frd.substringAfter("[")
            println(frd1)
            var frd2 = frd1.substringBefore("]")
            println(frd2)
            var result = frd2.replace(Regex("[qwrtpsdfghjklzxcvbnm]")) {
                when (it.value) {
                    "q" -> "Q"
                    "w" -> "W"
                    "r" -> "R"
                    "t" -> "T"
                    "p" -> "P"
                    "s" -> "S"
                    "d" -> "D"
                    "f" -> "F"
                    "g" -> "G"
                    "h" -> "H"
                    "j" -> "J"
                    "k" -> "K"
                    "l" -> "L"
                    "z" -> "Z"
                    "x" -> "X"
                    "c" -> "C"
                    "v" -> "V"
                    "b" -> "B"
                    "n" -> "N"
                    "m" -> "M"
                    else -> it.value
                }
            }
            var result5 = result.replace(Regex(", ")) {
                when (it.value) {
                    ", " -> " "
                    else -> it.value
                }
            }
            println(result)
            println(result5)
            return result5
        }
        throw NotImplementedError("Not implemented")
    }
}

