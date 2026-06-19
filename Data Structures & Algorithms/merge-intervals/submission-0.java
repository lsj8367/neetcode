class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (o1, o2) -> Integer.compare(o1[0], o2[0]));
        List<int[]> results = new ArrayList<>();

        results.add(intervals[0]);

        for(int[] interval : intervals) {
            int start = interval[0];
            int end = interval[1];
            int[] last = results.get(results.size() - 1);

            if (start <= last[1]) {
                last[1] = Math.max(last[1], end);
            } else {
                results.add(new int[]{start, end});
            }
        }

        return results.toArray(new int[results.size()][]);        
    }
}
