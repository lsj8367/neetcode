class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> results = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                //정렬된 상태에서 양수면 어차피 0이 안됨
                break;
            }

            if (i > 0 && nums[i] == nums[i - 1]) {
                // 같은 조합은 1번만 구성
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum > 0) {
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    results.add(List.of(nums[i], nums[left], nums[right]));
                    left++;
                    right--;

                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                }
            }
        }
        return results;
    }
}
