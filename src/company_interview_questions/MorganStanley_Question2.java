package company_interview_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author prateek.bangre on 23/10/21.
 * @Project Company_Interview_Question
 */
/*
Schedule meeting
calculate the maximum number of meetings that can be held based on given 2 arrays.
ize of arrays is from 1 to 50, and the values in the array are from 1 to 1000 max.

I have an array that represents starting time for meetings - [1,3,3,5,7]. Another array that represents the time taken for the above meeting - [2,2,1,2,1]

As per the above data, the first meeting starts at 1 and continues for 2hrs. so it covers from 1hr to 3hrs as meeting duration is 2hrs. The second and third meeting starts at 3 and they continue for 2hrs or 1hrs. so they cover 3 to 5 for 2nd meeting, 3 to 4 for the third meeting. The fourth meething starts at 5 and continues for 2hrs. So it covers 5 to 7 as duration is 2hrs The last meeting starts at 7 and continues for 1hr.

The second and third are occurring at same time, so we just need to pick only one such that we can arrange maximum number of meetings.

For the given above sample data we can arrange 4 meetings.

Another example:

starting time for meetings - [1,3,5]. Time taken for meetings - [2,2,2].

Here none of the meetings can conflict so maximum we can arrange 3 meetings.
*/
public class MorganStanley_Question2 {

    static int getMaximumMeetings(List<Integer> start, List<Integer> timeTaken) {
        List<Interval> list = new ArrayList<>(); // create a List of Interval
        for (int i = 0; i < start.size(); i++) {
            list.add(new Interval(start.get(i), start.get(i) + timeTaken.get(i)));
        }
        list.sort(Comparator.comparingInt(i -> i.end)); // sort by finish times ascending

        int res = 0;
        int prevEnd = Integer.MIN_VALUE; // finish time of the previous meeting

        for (Interval i : list) {
            if (i.start >= prevEnd) { // is there a conflict with the previous meeting?
                res++;
                prevEnd = i.end; // update the previous finish time
            }
        }
        return res;
    }

    public static void main(String[] args) {
//        List<Interval> start = new ArrayList<>(Arrays.asList(new Inte));
        

//        System.out.println(getMaximumMeetings(),
//                new ArrayList<Integer>(Arrays.asList(new int[]{2,2,1,2,1}))));

    }

    static class Interval {
        int start;
        int end;
        Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
}
