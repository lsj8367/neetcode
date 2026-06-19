class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        // newInterval에서 start가 이전구간의 start 값보다 크고 end보다는 작으면 포함
        // newInterval에서 end가 다음구간의 start 값보다 크고 end보다는 작으면 포함
        // 위의 조건이 만족되면 이전과 다음의 start, end 를 준다


        // newInterval에서 start가 앞구간의 end보다 크고 end값이 다음 구간의 start 보다 작으면 배열을 한개 만들어서 사이에 넣어준다.
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
