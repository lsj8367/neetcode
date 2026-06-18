/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        Collections.sort(intervals, Comparator.comparingInt(i -> i.start));
        int n = intervals.size();

        for(int i = 0; i < n; i++) {
            Interval a = intervals.get(i);
            for(int j = i + 1; j < n; j++) {
                Interval b = intervals.get(j);

                if (Math.min(a.end, b.end) > Math.max(a.start, b.start)) {
                    return false;
                }
            }
        }
        return true;
    }
}
