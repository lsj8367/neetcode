class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> results = new ArrayList<>();
        results.add(intervals[0]);
        for(int[] interval: intervals) {
            int start = interval[0];
            int end = interval[1];
            int lastEnd = results.get(results.size() - 1)[1];

            if(start <= lastEnd) {
                results.get(results.size() - 1)[1] = Math.max(lastEnd, end);
            } else {
                results.add(new int[]{start, end});
            }

        }
        return results.toArray(new int[results.size()][]);
    }
}
