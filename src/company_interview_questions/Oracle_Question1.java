package company_interview_questions;

import java.util.Arrays;

/**
 * @author prateek.bangre on 06/09/21.
 * @Project TestProject
 */
/*
Given an array of integers and a value, determine if there are any two integers in the array
whose sum is equal to the given value.
* */
public class Oracle_Question1 {

    public static void main(String[] args) {
        int[] arr = new int[]{0,1,1,1,0,1,0,1};
//        int[] arr = new int[]{0,1,1,1,1,1,1,1};

        int left = 0;
        int right = arr.length - 1 ;
        while (left<right){

            if(arr[right] == 0  && arr[left] == 1){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }else if(arr[left] == 0){
                ++left;
            }else if(arr[right] == 1){
                --right;
            }
        }

        Arrays.stream(arr).forEach(System.out::print);

    }

}
