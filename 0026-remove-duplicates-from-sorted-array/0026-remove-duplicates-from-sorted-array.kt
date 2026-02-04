class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        val duplicateRemoveArray = nums.toSet()
        for (index in duplicateRemoveArray.indices) {
            nums[index] = duplicateRemoveArray.elementAt(index)
        }
        return duplicateRemoveArray.size
    }
}