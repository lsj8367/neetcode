class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int left = 0; left < nums.length; left++) {
            for(int right = left + 1; right < Math.min(nums.length, left + k + 1); right++) {
                if (nums[left] == nums[right]) {
                    return true;
                }
            }
        }
        return false;
    }
}