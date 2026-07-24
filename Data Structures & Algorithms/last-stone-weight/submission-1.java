class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> q = new PriorityQueue<>();
        for(int stone: stones) {
            q.offer(-stone);
        }

        while(q.size() > 1) {
            int x = q.poll();
            int y = q.poll();
            if (y > x) {
                q.offer(x - y);
            }
        }

        q.offer(0);
        return Math.abs(q.peek());
    }
}
