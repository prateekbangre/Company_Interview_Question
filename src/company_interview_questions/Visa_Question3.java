package company_interview_questions;

/**
 * @author prateek.bangre on 08/10/21.
 * @Project Company_Interview_Question
 */
/*
The columns in an excel sheet are named as A, B, .., Z, AA, AB,.. and so on. Write a function which returns column name
given the column number. Eg - column number 27 is AA.

Input          Output
 26             Z
 51             AY
 52             AZ
 80             CB
 676            YZ
 702            ZZ
 705            AAC
*/
public class Visa_Question3 {

    private static String getColumnNameOfNo(int input) {

        StringBuilder result = new StringBuilder();

        while (input > 0){

            int rem = input % 26;
            if (rem == 0){
                result.append('Z');
                input = (input/26) -1;
            }else {
                result.append((char) (rem - 1 + 'A'));
                input = input / 26;
            }
        }

        return  result.reverse().toString();
    }


    public static void main(String[] args) {

        int input = 20;
        System.out.println(getColumnNameOfNo((input)));

//        input = 2;
//        System.out.println(getColumnNameOfNo((input)));
//
//        input = 27;
//        System.out.println(getColumnNameOfNo((input)));
//
//        input = 80;
//        System.out.println(getColumnNameOfNo((input)));
//
//        input = 676;
//        System.out.println(getColumnNameOfNo((input)));
//
//        input = 702;
//        System.out.println(getColumnNameOfNo((input)));
//
//        input = 705;
//        System.out.println(getColumnNameOfNo((input)));
//
//        input = 52;
//        System.out.println(getColumnNameOfNo((input)));

    }
}
