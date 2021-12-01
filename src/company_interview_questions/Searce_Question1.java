package company_interview_questions;

/**
 * @author prateek.bangre on 25/10/21.
 * @Project Company_Interview_Question
 */
/*
Count trailing zeroes in factorial of a number
ex: num = 5 => o/p: 1
num = 20 => o/p: 4
*/
public class Searce_Question1 {
    private static int factorial(int num){
        if(num == 1)
            return 1;
        return num * factorial(num-1);
    }

    public static void main(String[] args) {

        int num = 20;
        int numFactorial = factorial(num);
        System.out.println(numFactorial);

        String str = String.valueOf(numFactorial);
        int last = str.length()-1;
        while(true){
            if(str.charAt(last) != '0')
                break;
            else
                --last;
        }

        System.out.println(str.length()-1 - last);
    }
}
