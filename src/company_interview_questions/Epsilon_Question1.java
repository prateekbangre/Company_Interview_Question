package company_interview_questions;

/**
 * @author prateek.bangre on 14/09/21.
 * @Project DataStructure_Algorithms
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Deque;

public class Epsilon_Question1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        String param = br.readLine();

        String out_ = convert(param);
        System.out.println(out_);

        wr.close();
        br.close();
    }

    static boolean isOperator(char ch){
        if(ch=='+' || ch=='-' || ch=='*' || ch=='/')
            return true;
        return false;
    }

    static String convert(String param){
        // Write your code here
        String result = "";

        Deque<String> stack = new ArrayDeque<>();
        int length = param.length();
        for(int i=0; i<length ; ++i ){

            char ch = param.charAt(i);

            if(isOperator(ch) && stack.size() >= 2){

                String firstChar = stack.pop();
                String secondChar = stack.pop();

                if(i<length-1 && isOperator(param.charAt(i+1))){
                    stack.push(secondChar + ch + firstChar);
                }else{
                    stack.push("(" + secondChar + ch + firstChar + ")");
                }
            }else{
                stack.push(ch + "");
            }
        }


        if(stack.size() == 1){
            result = stack.pop();
            result = result.substring(1, result.length()-1);
        }else{
            result = "invalid";
        }
        // System.out.println(param+" => "+result);
        return result;
    }
}

