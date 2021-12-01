package company_interview_questions;

/**
 * @author prateek.bangre on 01/11/21.
 * @Project TestProject
 */
/*
reverse linked list

*/
public class FreshWorks_Question1 {

    Node head;

    static class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
            next = null;
        }
    }

    public  static Node reverse(Node node){

        Node prev = null;
        Node next = null;
        Node current = node;

        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    public static void main(String[] args) {

        FreshWorks_Question1 obj = new FreshWorks_Question1();

        obj.head = new Node(1);
        obj.head.next = new Node(2);
        obj.head.next.next = new Node(3);
        obj.head.next.next.next = new Node(4);

        reverse(obj.head);


    }


}
