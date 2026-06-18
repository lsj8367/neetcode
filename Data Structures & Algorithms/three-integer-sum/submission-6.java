class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> results = new HashSet<>();
        Arrays.sort(nums);
        int n = nums.length;
        
        for(int i = 0; i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length - 1;
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
                }
            }
        }

        return new ArrayList<>(results);
    }
}
