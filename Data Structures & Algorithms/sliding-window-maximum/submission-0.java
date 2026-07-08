class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] results = new int[nums.length - k + 1];

        for(int left = 0; left <= nums.length - k; left++) {
            int maxI = nums[left];
            for(int right = left; right < left + k; right++) {
                maxI = Math.max(maxI, nums[right]);
            }
            results[left] = maxI;
        }

        return results;
    }
}
