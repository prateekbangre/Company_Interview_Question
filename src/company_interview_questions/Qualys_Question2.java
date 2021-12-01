package company_interview_questions;

/**
 * @author prateek.bangre on 30/10/21.
 * @Project TestProject
 */
/*
Find longest Palindrome in given string
String str = abcbabccba
o/p: abccba
*/
public class Qualys_Question2 {

    private static int start = 0;
    private static int  max = Integer.MIN_VALUE;

    private static String longestPalindrome(String str){

        for(int i=0; i<str.length()-1; ++i){

            findPalindrome(str, i, i);
            findPalindrome(str, i, i+1);
        }

        return str.substring(start, max+start);
    }

    private static void findPalindrome(String str, int left, int right){


        while(left>=0 && right<str.length() && str.charAt(left) == str.charAt(right)){
            left--;
            right++;
        }

        if(max < (right-left-1)){
            start = left+1;
            max = right-left-1;
        }
    }

    public static void main(String[] args) {

        String str = "abcbabccba";
        System.out.println(longestPalindrome(str));
    }
}
