class Solution {
    public int[] productExceptSelf(int[] nums) {
        int multiply = 1;
        int zeroCount = 0;

        for (int num : nums) {
            if (num == 0) {
                zeroCount++;
            } else {
                multiply *= num;
            }
        }

        // 2개 이상이면 0이 2개니까 어디든 0이 될것
        if (zeroCount >= 2) {
            return new int[nums.length];
        }

        int[] answers = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            // zeroCount가 있으면
            if (zeroCount > 0) {
                if (nums[i] == 0) {
                    answers[i] = multiply;
                } else {
                    answers[i] = 0;
                }
            } else {
                answers[i] = multiply / nums[i];
            }
        }
        return answers;
    }
}  
