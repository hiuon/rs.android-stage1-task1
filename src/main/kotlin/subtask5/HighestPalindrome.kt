package subtask5

class HighestPalindrome {

    // TODO: Complete the following function
    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {
        var digitString1 = StringBuilder(digitString)
        var counter = 0
        var highest = -1
        var index = ArrayList<Int>()
        for (i in 0 until digitString1.length/2){

            if (digitString[i] != digitString1[digitString.length - 1 - i]){
                index.add(i)
                index.add(digitString.length - 1 - i)
                if (highest < digitString1[i].toInt()){
                    highest = digitString1[i].toInt()
                    for (j in 0 until index.size){
                        digitString1[index[j]] = highest.toChar()
                    }
                }
                else if(highest < digitString1[digitString.length - 1 - i].toInt()){
                    highest = digitString1[digitString.length - 1 - i].toInt()
                    for (j in 0 until index.size){
                        digitString1[index[j]] = highest.toChar()
                    }
                }
                counter++
            }
        }
        return if(counter > k){
            "-1"
        }
        else{
            digitString1.toString()
        }
        throw NotImplementedError("Not implemented")
    }
}
