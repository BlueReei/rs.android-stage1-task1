package subtask1

class HappyArray {
    fun Checker(sadArray: IntArray) : IntArray {
        var happyArray = IntArray(0)
        for (i in sadArray.indices) {
            if ((i > 0) && (i < sadArray.lastIndex) && (sadArray[i - 1] + sadArray[i + 1] < sadArray[i])) {
            } else {
                happyArray += sadArray[i]
            }
        }
        return happyArray
    }

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        var happyArray = IntArray(0)
        for (i in sadArray.indices) {
            if ((i > 0) && (i < sadArray.lastIndex) && (sadArray[i - 1] + sadArray[i + 1] < sadArray[i])) {
            } else {
                happyArray += sadArray[i]
            }
        }
        do {
            happyArray = Checker(happyArray)}
        while (!happyArray.contentEquals(Checker(happyArray)))
        return happyArray
    }
}
