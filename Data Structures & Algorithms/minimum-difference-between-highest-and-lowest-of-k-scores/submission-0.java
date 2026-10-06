class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int result = Integer.MAX_VALUE;
        int left = 0;
        int right = k - 1;
        while (right < nums.length) {
            result = Math.min(result, nums[right] - nums[left]);
            left++;
            right++;
        }
        return result;
    }
}