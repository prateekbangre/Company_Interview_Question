package company_interview_questions;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author prateek.bangre on 29/09/21.
 * @Project TestProject
 */
/*
Write a program to remove all duplicate characters after its first occurrence in a string without changing the order.

input1 = aaabbbbcccc
output1 = abc

input2 = xyz
output2 =xyz

input3 = aaabbbbccccabcdabcd
output3 = abcd

input4 = dcbaabcd
output4 = dcba
*/
public class Soroco_Question1 {

    public static void main(String[] args) {

        String input = "aaabbbbcccc";
        System.out.println(getUniqueString(input));



    }

    private static String getUniqueString(String input) {

        Set<Character> map =  new LinkedHashSet<>();
        StringBuilder result = new StringBuilder();

        for (char ch : input.toCharArray()){
            if(map.add(ch)) {
                result.append(ch);
            }

        }
        return result.toString();
    }

    private static String getUniqueString1(String input) {

        String result = "";
        for(char ch : input.toCharArray()){
            if(result.indexOf(ch) < 0){
                result += ch;
            }
        }
        return result;
    }
}
// map