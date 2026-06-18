class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // for(int i = 0; i < numbers.length; i++) {
        //     for (int j = 0; j < numbers.length; j++) {
        //         if (numbers[i] + numbers[j] == target) {
        //             return new int[]{i + 1, j + 1};
        //         }
        //     }
        // }
        // return null;
        int left = 0;
        int right = numbers.length - 1;
        
        while (left < right) {
            if (numbers[left] + numbers[right] > target) {
                right--;
            } else if (numbers[left] + numbers[right] < target) {
                left++;
            } else {
                return new int[]{left + 1, right + 1};
            }
        }
        return null;
    }
}
