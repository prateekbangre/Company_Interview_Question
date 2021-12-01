package company_interview_questions;

/**
 * @author prateek.bangre on 25/10/21.
 * @Project Company_Interview_Question
 */
/*
input will be a string, str = madam ->
if palindrome -> print same
if not -> print reverse of string
*/
public class Searce_Question2 {

    public static void main(String[] args) {
        boolean isPalindrome = true;
        String str  = "madrm";
        char[] ch = str.toCharArray();
        int length = str.length()-1;;

        for(int i=0; i<str.length()/2; ++i){
            if(ch[i] != ch[length-i]){
                isPalindrome = false;
                char temp = ch[i];
                ch[i] = ch[length-i];
                ch[length-i] = temp;
            }
        }

        if (isPalindrome){
            System.out.println(str);
        }else {
            System.out.println(String.valueOf(ch));
        }
    }
}
