package company_interview_questions;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * @author prateek.bangre on 08/10/21.
 * @Project Company_Interview_Question
 */
/*
Given a string s of lowercase alphabets and a number k, the task is to print the
minimum value of the string after removal of ‘k’ characters. The value of a string is
defined as the sum of squares of the count of each distinct character.
*/
public class Some_Company_Question1 {
    public static void main(String[] args) {

        String str = "aabcbcbcabcc";
        int k = 2;

        System.out.println(getSumOfDistinctChar(str, k));
        k = 3;
        System.out.println(getSumOfDistinctChar(str, k));
        k = 4;
        System.out.println(getSumOfDistinctChar(str, k));

    }

    private static int getSumOfDistinctChar(String str, int k) {

        int TOTAL_CHAR = 26;
        int length = str.length();

        int[] frequency = new int[TOTAL_CHAR];
        for (int i=0; i<length; ++i){
            frequency[str.charAt(i) - 'a']++;
        }

        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i=0; i<TOTAL_CHAR; ++i){
            if (frequency[i] != 0)
                queue.add(frequency[i]);
        }

        while (k != 0){
            queue.add(queue.poll() - 1);
            k--;
        }

        int result = 0;
        // abcc  1^2 + 1^2 + 2^2
        while (!queue.isEmpty()){
            result +=  (queue.peek() * queue.poll());
        }

        return result;
    }

}
