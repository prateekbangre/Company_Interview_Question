package company_interview_questions;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author prateek.bangre on 09/10/21.
 * @Project Company_Interview_Question
 */
/*
url: https://www.interviewbit.com/problems/meeting-rooms/
Given an 2D integer array A of size N x 2 denoting time intervals of different meetings.
Where:
A[i][0] = start time of the ith meeting.
A[i][1] = end time of the ith meeting.
Find the minimum number of conference rooms required so that all meetings can be done.

Problem Constraints
1 <= N <= 10
0 <= A[i][0] < A[i][1] <= 2 * 109
Input Format: The only argument given is the matrix A.
Output Format: Return the minimum number of conference rooms required so that all meetings can be done.

Example 1:
Input:
 A = [      [0, 30]
            [5, 10]
            [15, 20]
     ]
Output: 2

Example 2:
Input:
 A =  [     [1, 18]
            [18, 23]
            [15, 29]
            [4, 15]
            [2, 11]
            [5, 13]
      ]
Output: 4
*/
public class DBS_Question1 {
    public static void main(String[] args) {

        int[][] arr = {{1, 18}, {18, 23}, {15, 29}, {4, 15}, {2, 11}, {5, 13}};

//        Arrays.sort(arr, (obj1, obj2) -> {
//            return obj1[0]-obj2[0];
//        });
        Arrays.sort(arr, Comparator.comparingInt(obj -> obj[0]));
        int roomCount = 0;
        for (int i=0; i< arr.length-1; ++i){
            if(arr[i][1] > arr[i+1][0]){
                roomCount++;
            }
        }
        System.out.println(roomCount);
    }
}
