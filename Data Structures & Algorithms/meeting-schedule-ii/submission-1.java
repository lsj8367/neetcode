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
    public int minMeetingRooms(List<Interval> intervals) {
        intervals.sort((a, b) -> a.start - b.start);
        Queue<Integer> q = new PriorityQueue<Integer>();
        
        for(Interval interval: intervals) {
            if(!q.isEmpty() && q.peek() <= interval.start) {
                q.poll();
            }
            q.offer(interval.end);
        }
        return q.size();
    }
}
