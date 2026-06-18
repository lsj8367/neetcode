class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int currentMax = 0;
        int currentMin = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int total = 0;

        for(int i = 0; i < nums.length; i++) {
            total += nums[i];
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            currentMin = Math.min(nums[i], currentMin + nums[i]);
            max = Math.max(max, currentMax);
            min = Math.min(min, currentMin);
        }
        if (max < 0) {
             return max;
        }
        return Math.max(max, total - min);
    }
}