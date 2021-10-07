package company_interview_questions;

/**
 * @author prateek.bangre on 21/09/21.
 * @Project DataStructure_Algorithms
 */
//url: https://leetcode.com/problems/minimum-number-of-swaps-to-make-the-string-balanced/
public class Visa_Question1 {

    public int minSwaps (String s) {
        int stack_size = 0;
        for (int i = 0; i < s.length (); i++) {
            char ch = s.charAt (i);
            if (ch == '(')
                stack_size++;
            else {
                if (stack_size > 0)
                    stack_size--;
            }
        }
        return (stack_size + 1) / 2;
    }

    public static void main(String[] args) {

        System.out.println(new Visa_Question1().minSwaps(")()("));
        System.out.println(new Visa_Question1().minSwaps(")))((("));
        System.out.println(new Visa_Question1().minSwaps("()()(")); // o/p should be -1
    }
}
