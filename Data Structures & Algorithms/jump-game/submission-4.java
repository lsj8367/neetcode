class Solution {
    public boolean canJump(int[] nums) {
        int result = 0;

        for(int i = 0; i < nums.length; i++) {
            if (i > result) {
                return false;
            }

            result = Math.max(result, i + nums[i]);
        }
        return true;
    }
}
