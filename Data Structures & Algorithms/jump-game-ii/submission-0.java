class Solution {
    public int jump(int[] nums) {
        int l = 0;
        int r = 0;
        int result = 0;

        while (r < nums.length - 1) {
            int distance = 0;

            for(int i = l; i < r + 1; i++) {
                distance = Math.max(distance, i + nums[i]);
            }

            l = r + 1;
            r = distance;
            result++;
        }

        return result;
    }
}
