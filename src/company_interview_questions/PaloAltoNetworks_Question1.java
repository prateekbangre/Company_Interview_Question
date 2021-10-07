package company_interview_questions;

/**
 * @author prateek.bangre on 21/09/21.
 * @Project DataStructure_Algorithms
 */
//url: https://www.geeksforgeeks.org/maximize-the-number-n-by-inserting-given-digit-at-any-position/
public class PaloAltoNetworks_Question1 {

    public int solution(int N) {
        // write your code in Java SE 8

        if(N == 0)
            return 5 * 10;

        int neg = N/Math.abs(N);
        N = Math.abs(N);
        // int n = N;
        int length = Integer.toString(N).length();

        int position = 1;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<=length; ++i){
            int newValue = ((N/position) * (position*10)) + (5*position) + (N%position);
            max = Math.max(max, newValue*neg);
            position = position*10;
        }
        return max;
    }
}
