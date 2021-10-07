package company_interview_questions;

import java.util.PriorityQueue;

/**
 * @author prateek.bangre on 29/09/21.
 * @Project TestProject
 */
/*
Given an array of integers, your task is to write a program that efficiently finds the kth largest element present in the array

input1 = arr[] = {12, 35, 1, 10, 34, 1}, k = 2
output1 = 34

input2 = arr[] = {12, 35, 1, 10, 34, 1}, k = 6
output2 = -1

input3 = arr[] = {12, 12, 12}, k = 2
output3 = -1
*/
public class Soroco_Question2 {

    public static void main(String[] args) {

//        int[] arr = new int[]{12, 35, 1, 10, 34, 1};
//        int k = 2;
//        System.out.println(findKthElement(arr, k));

//        int[] arr = new int[]{12, 35, 1, 10, 34, 1}; //-> 35 34 12 10 1 1
//        int k = 6;
//        System.out.println(findKthElement(arr, k));
        int[] arr = new int[]{12, 35, 1, 10, 34, 1, 35, 35}; //-> 35 34 12 10 1
        int k = 6;
        System.out.println(findKthElement(arr, k));

    }

    private static int findKthElement(int[] arr, int k) {

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int value : arr){               //a

            if (!queue.contains(value)){     //b
                queue.add(value);
                if(queue.size() > k){
                    queue.poll();               //c
                }
            }
        }

        if (queue.size() < k)
            return -1;
        else
            return queue.poll();

        //n(logk)
        //n(logk) + k => nk(log k)
    }
}
