class Solution {
    int[] cache; // 계산한 값 저장
    
    public int climbStairs(int n) {
        cache = new int[n + 1];
        return helper(n);
    }
    
    private int helper(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        if (cache[n] != 0) return cache[n]; // 이미 계산했으면 바로 반환!
        
        cache[n] = helper(n - 1) + helper(n - 2); // 저장!
        return cache[n];
    }
}
