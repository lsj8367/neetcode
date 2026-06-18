class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> numCount = new HashMap<>();
        for(Integer num : nums) {
            if (numCount.containsKey(num)) {
                return true;
            }
            numCount.put(num, numCount.getOrDefault(num, 0) + 1);
        }   
        return false;
    }
}