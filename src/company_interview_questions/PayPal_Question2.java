package company_interview_questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author prateek.bangre on 02/12/21.
 * @Project Company_Interview_Question
 */
//url: https://leetcode.com/discuss/interview-question/1194238/paypal-max-tasks-that-can-be-completed-in-given-budget
public class PayPal_Question2 {

    static int solve(int n, int t, int[][] task){
        // Write your code here

        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        Arrays.sort(task, Comparator.comparingInt(no -> no[0]));

        int sum = 0;
        int max = 0;
        for(int i=0; i<n; ++i){

            int dis = 2*task[i][0];
            int remTime = t - dis;
            int effort = task[i][i];

            if(remTime<0)
                break;

            while(sum>remTime){
                sum -= queue.poll();
            }

            if((queue.isEmpty() && remTime>effort)
                    || (sum+effort) <= remTime)
            {
                queue.add(effort);
                sum += effort;
            }else{
                Integer temp = queue.peek();
                if(temp != null && temp>effort){
                    queue.poll();
                    queue.add(effort);
                    sum = sum - temp+effort;
                }

            }
            max = Math.max(max, queue.size());
        }

        return max;
    }

    public static void main(String[] args) {

    }
}
