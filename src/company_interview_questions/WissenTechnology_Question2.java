package company_interview_questions;

import java.util.Arrays;

/**
 * @author prateek.bangre on 08/10/21.
 * @Project Company_Interview_Question
 */
/*
You have a array of integer and u have to find median of the sub-array range given to you
ex: a ={2 ,4 ,5 ,3 ,1 ,6}
sub-array range L=2 R=4 the array will be 4,5,3 then sort it 3 4 5 then median will be 4.
*/
public class WissenTechnology_Question2 {

    public static void main(String[] args) {
        int[] A = new int[]{2 ,4 ,5 ,3 ,1 ,6};
        int L = 1;
        int R = 6;
        findMidOfSubArray(A, L, R);
        findMidOfSubArray(A, 2, 4);
        findMidOfSubArray(A, 3, 3);

    }

    private static void findMidOfSubArray(int[] A, int L, int R) {
        int[] newArr = Arrays.copyOfRange(A, L-1, R);
        Arrays.sort(newArr);
        int mid = newArr.length/2;
        if (newArr.length%2 != 0 || mid==0 )
            System.out.println(newArr[mid]);
        else
            System.out.println(newArr[mid-1]);
    }
}
