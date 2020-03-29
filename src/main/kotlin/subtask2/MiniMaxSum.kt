package subtask2

class MiniMaxSum {

    // TODO: Complete the following function
    fun getResult(input: IntArray): IntArray {
        var output = intArrayOf()
        var buffer = intArrayOf()
        var sum = 0
        var k = 0
        while (k < input.size) {
            for (i in input.indices) {
                if (k == i) {}
                else {
                    sum+=input[i]
                }
            }
            buffer += sum
            sum = 0
            k++
        }
        output += buffer.min()?: Int.MAX_VALUE
        output += buffer.max()?: 0
        return output
    }
}
