class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        
        for(int i = 0; i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            if (i > 0 && nums[i - 1] == nums[i]) {
                continue;
            }

            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum < 0) {
                    left++;
                } else if (sum > 0) {
                    right--;
                } else {
                    results.add(List.of(nums[i], nums[left], nums[right]));
                    left++;
                    right--;

                    while(left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }

                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                }
            }
        }

        return new ArrayList<>(results);
    }
}
