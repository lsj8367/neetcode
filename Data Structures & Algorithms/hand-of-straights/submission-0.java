class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) {
            return false;
        }

        Arrays.sort(hand);
        Map<Integer, Integer> numCount = new HashMap<>();
        
        for(int h : hand) {
            numCount.put(h, numCount.getOrDefault(h, 0) + 1);
        }

        for(int h : hand) {
            if (numCount.get(h) == 0) {
                continue;
            }

            for(int i = h; i < h + groupSize; i++) {
                if (numCount.getOrDefault(i, 0) == 0) {
                    return false;
                }
                
                numCount.put(i, numCount.get(i) - 1);
            }
        }
        return true;
    }
}
