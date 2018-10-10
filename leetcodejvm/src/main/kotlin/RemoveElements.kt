class RemoveElements {
    fun removeElements(nums: IntArray, `val`: Int): Int {
        if (nums.isEmpty()) {
            return 0
        }
        var j = 0
        for (i in nums.indices) {
            if (nums[i] == `val`) {
                continue
            } else {
                nums[j] = nums[i]
                j++
            }
        }
        return j
    }
}