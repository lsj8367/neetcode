class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> results = new ArrayList<>();
        for(int[] interval: intervals) {
            if (newInterval == null || interval[1] < newInterval[0]) {
                results.add(interval);
            } else if (interval[0] > newInterval[1]) {
                results.add(newInterval);
                results.add(interval);
                newInterval = null;
            } else {
                newInterval[0] = Math.min(interval[0], newInterval[0]);
                newInterval[1] = Math.max(interval[1], newInterval[1]);
            }
        }

        if (newInterval != null) {
            results.add(newInterval);
        }
        
        return results.toArray(new int[results.size()][]);
    }
}
