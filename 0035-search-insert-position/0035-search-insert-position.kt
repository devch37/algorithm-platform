class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        if (nums.isEmpty()) return 0
        for (index in nums.indices) {
            if (nums[index] >= target) return index
        }
        return nums.size
    }
}