package subtask5

class HighestPalindrome {

    // TODO: Complete the following function
    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {
        var k = k
        val palin = digitString.toCharArray()
        var maxPalindome = ""
        var l = 0
        var r = digitString.length - 1
        while (l < r) {
            if (digitString[l] != digitString[r]) {
                palin[r] = Math.max(digitString[l].toInt(), digitString[r].toInt()).toChar()
                palin[l] = palin[r]
                k--
            }
            l++
            r--
        }
        if (k < 0) {
            return "-1"
        }
        l = 0
        r = digitString.length - 1
        while (l <= r) {
            if (l == r) {
                if (k > 0) {
                    palin[l] = '9'
                }
            }

            if (palin[l] < '9') {
                if (k >= 2 && palin[l] == digitString[l] && palin[r] == digitString[r]
                ) {
                    k -= 2
                    palin[r] = '9'
                    palin[l] = palin[r]
                } else if (k >= 1 && (palin[l] != digitString[l]
                            || palin[r] != digitString[r])
                ) {
                    k--
                    palin[r] = '9'
                    palin[l] = palin[r]
                }
            }
            l++
            r--
        }
        for (i in palin.indices) maxPalindome += palin[i]
        return maxPalindome
    }
}
