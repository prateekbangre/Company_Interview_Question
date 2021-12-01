package company_interview_questions;

/**
 * @author prateek.bangre on 30/10/21.
 * @Project TestProject
 */
/*
You have a LinkedList and you have to add 1st and last element and then 2nd and 2nd last element and soo on.
example: LinkedList = 1 -> 2 -> 3 -> 5 -> 6 -> 8 -> null
o/p:    1+8 -> 9
        2+6 -> 8
        3+5 -> 8
*/
public class Qualys_Question1 {

    static class Node{
        int value;
        Node next;
    }

    public static Node reverse(Node head){

        Node prev = null;
        Node current = head;
        Node next = null;
        while(current != null){

            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    public static int maxSum(Node head){

        Node rev = reverse(head);
        int max = Integer.MIN_VALUE;
        int size =5;
        for(int i=0; i<size/2; ++i){
            max = Math.max(max, head.value+rev.value);
            head = head.next;
            rev = rev.next;
        }
        return max;
    }


    public static void main(String[] args) {

    }
}
