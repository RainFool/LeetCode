class RemoveDuplicatesFromSortedArray {
    fun removeDuplicates(nums: IntArray): Int {
        if (nums.isEmpty()) {
            return 0
        }
        var j = 0
        for (i in nums.indices) {
            if (nums[i] != nums[j]) {
                j++
                nums[j] = nums[i]
            }
        }
        return j + 1
    }
}