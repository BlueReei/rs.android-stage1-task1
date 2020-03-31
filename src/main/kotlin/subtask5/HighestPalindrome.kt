package subtask5

class HighestPalindrome {

    // TODO: Complete the following function
    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {
        var k = k
        val exPalindrome = digitString.toCharArray()
        var maxPalindome = ""
        var left = 0
        var right = digitString.length - 1
        while (left < right) {
            if (digitString[left] != digitString[right]) {
                exPalindrome[right] = Math.max(digitString[left].toInt(), digitString[right].toInt()).toChar()
                exPalindrome[left] = exPalindrome[right]
                k--
            }
            left++
            right--
        }
        if (k < 0) {
            return "-1"
        }
        left = 0
        right = digitString.length - 1
        while (left <= right) {
            if (left == right) {
                if (k > 0) {
                    exPalindrome[left] = '9'
                }
            }
            if (exPalindrome[left] < '9') {
                if (k >= 2 && exPalindrome[left] == digitString[left] && exPalindrome[right] == digitString[right]) {
                    k -= 2
                    exPalindrome[right] = '9'
                    exPalindrome[left] = exPalindrome[right]
                } else if (k >= 1 && (exPalindrome[left] != digitString[left] || exPalindrome[right] != digitString[right])) {
                    k--
                    exPalindrome[right] = '9'
                    exPalindrome[left] = exPalindrome[right]
                }
            }
            left++
            right--
        }
        for (i in exPalindrome.indices) maxPalindome += exPalindrome[i]
        return maxPalindome
    }
}
