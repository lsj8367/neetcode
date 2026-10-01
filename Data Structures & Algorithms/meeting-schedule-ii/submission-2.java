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


// start 0, 5, 15
// end 10, 20, 40
/*
0 < 10 start++
5 < 10 start++ count 2
15 > 10 end++ count 1


*/

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        int[] starts = new int[intervals.size()];
        int[] ends = new int[intervals.size()];

        for(int i = 0; i < intervals.size(); i++) {
            starts[i] = intervals.get(i).start;
            ends[i] = intervals.get(i).end;
        }

        Arrays.sort(starts);
        Arrays.sort(ends);

        int result = 0;
        int s = 0;
        int e = 0;
        int count = 0;
        while (s < intervals.size()) {
            if (starts[s] < ends[e]) {
                //end가 더 크니까 시작할 수 있음.
                s++;
                count++;
            } else {
                //아닌경우는 회의가 끝난거니까 진행중인 회의를 1개 완료시킨다.
                e++;
                count--;
            }
            result = Math.max(result, count);
        }

        return result;
    }
}
