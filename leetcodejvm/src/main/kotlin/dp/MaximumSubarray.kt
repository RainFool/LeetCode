package dp

/*
* Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
* 找到最大和子序列
*
Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.

状态：d(i)
状态转移方程：d(i) = d(i-1) > 0 ? d(i) + A[i] : A[i]
* */
class MaximumSubarray {

    fun maxSubArray(nums: IntArray): Int {
        val max = Array<Int>(nums.size) { 0 }
        nums.forEachIndexed() { index, value ->
            if (index == 0) {
                max[index] = value
            } else {
                if (max[index - 1] > 0) {
                    max[index] = max[index - 1] + value
                } else {
                    max[index] = value
                }
            }
        }
        return max.max() ?: 0
    }


}

fun main(args: Array<String>) {
    val testArray = intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)
    val max = MaximumSubarray().maxSubArray(testArray)
    println(max)
}