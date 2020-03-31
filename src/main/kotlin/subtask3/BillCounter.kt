package subtask3

import kotlin.math.abs

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        var sum = bill.sum()-bill[k]
        return if (sum / 2 == b) "bon appetit" else (abs(sum / 2 - b)).toString()
    }
}
