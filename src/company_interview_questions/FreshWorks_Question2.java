package company_interview_questions;

import java.util.Stack;

/**
 * @author prateek.bangre on 02/11/21.
 * @Project TestProject
 */
/*
You have to create stack and get Min element from the stack
*/
public class FreshWorks_Question2 {

    int min = Integer.MAX_VALUE;
    Stack<Integer> stack = new Stack<>();

    public void push(int value) {

        if (stack.isEmpty()){
            stack.push(min);
            min = value;
            return;
        }

        if (value < min){
            stack.push(2*value - min);
            min = value;
        }else {
            stack.push(value);
        }
    }

    public void pop() {
        int top = stack.pop();
        if (top < min){
            min = 2*min - top;
        }

    }

    public int top() {
        System.out.println(stack.peek());
        return stack.peek();
    }

    public int getMin() {
        System.out.println(min);
        return min;
    }


    public static void main(String[] args) {
        FreshWorks_Question2 stackObj = new FreshWorks_Question2();
        stackObj.push(-2);
        stackObj.push(0);
        stackObj.push(-3);
        stackObj.getMin(); // return -3
        stackObj.pop();
        stackObj.top();    // return 0
        stackObj.getMin(); // return -2
    }
}
