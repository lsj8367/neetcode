class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] answers = new int[nums.length * 2];
        int n = nums.length;

        for(int i = 0; i < n; i++) {
            answers[i] = nums[i];
            answers[i + n] = nums[i];
        }

        return answers;
    }
}