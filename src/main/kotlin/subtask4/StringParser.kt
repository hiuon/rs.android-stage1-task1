package subtask4

import java.lang.StringBuilder

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        val brackets = listOf('<', '(', '[', '>', ')', ']')
        val result = ArrayList<String>()
        var string = StringBuilder(inputString)

        for (i in string.length - 1 downTo 0) {
            if (string[i] in brackets.subList(0, 3)) {
                var last = 0
                for (j in i until string.length) {
                    if (string[j] == brackets[brackets.indexOf(inputString[i]) + 3]) {
                        last = j
                        string[i] = '.'
                        string[last] = '.'
                        break
                    }
                }
                result.add(0, inputString.substring(i + 1, last))
            }
        }
        return result.toTypedArray()
    }
}

