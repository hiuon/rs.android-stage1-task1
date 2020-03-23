package subtask3

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        var sumAnn = bill.sum()/2 - bill[k]/2
        return if (sumAnn == b){
            "Bon Appetit"
        } else {
            (b - sumAnn).toString()
        }
        throw NotImplementedError("Not implemented")
    }
}
