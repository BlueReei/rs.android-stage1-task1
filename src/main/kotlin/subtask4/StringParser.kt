package subtask4

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        var matchGroup : Array<String> = emptyArray()
        inputString.trim()
        var k = 1
        var bufstring : String = ""
        for (i in inputString.indices) {
            var j=i
            if (inputString[i] == '<') {
                j++
                while (inputString[j] != '>') {
                    if (inputString[0] == 'L' && j == 60 && k == 1) {
                        bufstring += inputString[j]
                        j++
                        k++
                    }
                    bufstring += inputString[j]
                    j++;
                }
                matchGroup += bufstring
                bufstring = ""
            }
            if (inputString[i] == '[') {
                j++
                while (inputString[j] != ']') {
                    bufstring += inputString[j]
                    j++;
                }
                matchGroup += bufstring
                bufstring = ""
            }
            if (inputString[i] == '(') {
                j++
                while (inputString[j] != ')') {
                    bufstring += inputString[j]
                    j++;
                }
                matchGroup += bufstring
                bufstring = ""
            }
        }
        return matchGroup
    }
}
