package subtask3

import kotlin.math.abs

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        var sum = 0
        for (i in bill.indices) {
            sum += bill[i]
        }
        sum -= bill[k]

        if (sum / 2 == b) {return "bon appetit"}
        else {return (abs(sum / 2 - b)).toString()}
    }
}
