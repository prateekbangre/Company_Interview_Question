package company_interview_questions;

/**
 * @author prateek.bangre on 28/10/21.
 * @Project TestProject
 */
/*
find the longest substring with non-repeating characters
Input : ABCDABDEFGCABD
Output: ABDEFGC
*/
//NOte: not complete working code, few things need to be fixed
public class PayU_Question1 {

    private static boolean isValid(String str, int i, int j){
        boolean[] visited = new boolean[26];
        for(int p=i; p<=j; ++p){
            if(visited[str.charAt(i) - 'A']){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String str = "ABCDABDEFGCABD";

        int length = str.length();
        int res = Integer.MIN_VALUE;
        int start = 0;
        int end = 0;
        for(int i=0; i<length; ++i){
            for(int j=i; j<length; ++j){
                if(isValid(str, i, j)  && res<(j-i-1)){
                    start = i;
                    end = j;
                    res = end-start;
                }
            }
        }

        System.out.println(str.substring(start, end));
    }
}
