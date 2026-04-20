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
        Collections.sort(intervals, (in1, in2)-> {
            return in1.start-in2.start;
        });

        for (int i =1; i<intervals.size(); i++) {
            if (intervals.get(i).start< intervals.get(i - 1).end)
                return false;
        }
        // System.out.println(intervals);
        return true;
    }
}
