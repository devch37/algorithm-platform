class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        if (nums.isEmpty()) return 0
        var uniqueIndex = 1
        for (index in 1 until nums.size) {
            if (nums[index] != nums[index - 1]) {
                nums[uniqueIndex] = nums[index]
                uniqueIndex++
            }
        }
        return uniqueIndex
    }
}