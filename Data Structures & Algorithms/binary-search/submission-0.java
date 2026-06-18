class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(0, nums.length - 1, nums, target);
    }

    private int binarySearch(int left, int right, int[] nums, int target) {
        if (left > right) {
            return -1;
        }

        int medium = left + (right - left) / 2;

        if (nums[medium] == target) {
            return medium;
        }

        return (nums[medium] < target) ? 
            binarySearch(medium + 1, right, nums, target) : binarySearch(left, medium - 1, nums, target);
    }
}
