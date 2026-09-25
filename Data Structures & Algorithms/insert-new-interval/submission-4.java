class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> results = new ArrayList<>();

        for(int[] interval : intervals) {
            int start = interval[0];
            int end = interval[1];
            if (newInterval == null || end < newInterval[0]) {
                results.add(interval);
            } else if (start > newInterval[1]) {
                // 지금 배열의 앞 숫자가 새로 들어온 구간의 뒤 숫자보다 큰경우
                // 사이에 별도 구간이 들어가야 되는경우
                results.add(newInterval);
                results.add(interval);
                newInterval = null;
            } else {
                newInterval[0] = Math.min(start, newInterval[0]);
                newInterval[1] = Math.max(end, newInterval[1]);
            }
        }

        if (newInterval != null) {
            results.add(newInterval);
        }
        return results.toArray(int[][]::new);
    }
}
