package subtask2

class MiniMaxSum {

    // TODO: Complete the following function
    fun getResult(input: IntArray): IntArray {
        var max = input.max()
        var min = input.min()
        return arrayOf(input.sum() - max!!, input.sum() - min!!).toIntArray()
        throw NotImplementedError("Not implemented")
    }
}
