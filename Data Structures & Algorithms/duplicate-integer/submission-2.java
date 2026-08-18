class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> results = new HashSet<>();

        for(int num : nums) {
            if (results.contains(num)) {
                return true;
            }
            results.add(num);
        }
        return false;
    }
}