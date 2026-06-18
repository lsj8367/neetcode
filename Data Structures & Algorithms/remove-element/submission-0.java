class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        int n = nums.length;
        while (k < n) {
            if(nums[k] == val) {
                n--;
                nums[k] = nums[n];
            } else {
                k++;
            }
        }
        return n;
    }
}
