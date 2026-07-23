class KthLargest {
    List<Integer> list;
    int target;

    public KthLargest(int k, int[] nums) {
        target = k;
        list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }        
    }
    
    public int add(int val) {
        list.add(val);
        Collections.sort(list);
        return list.get(list.size() - target);
    }
}
