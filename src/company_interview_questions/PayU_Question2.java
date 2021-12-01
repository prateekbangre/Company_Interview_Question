package company_interview_questions;

/**
 * @author prateek.bangre on 28/10/21.
 * @Project TestProject
 */
/*
Given an array, arrange the items such that consecutive pairs have an opposite relationship. In O(n)

Input: 10 → 20 → 9 → 18 → 2 → 21
Output: 10 → 9 → 20 → 18 → 21 → 2
(10 > 9 < 20 > 18 < 21 > 2)
*/
public class PayU_Question2 {
    static class Node{
        int data;
        Node next;
    }

    Node arrangeList(Node node, boolean flag){

        if(node == null || node.next == null){
            return node;
        }

        if(flag){
            if(node.data < node.next.data){
                swap(node, node.next);
            }

            return	arrangeList(node.next, false);
        }else{
            if(node.data > node.next.data){
                swap(node, node.next);
            }
            return	arrangeList(node.next, true);
        }
    }

    private void swap(Node node, Node next){
        Node temp = node;
        node = next;
        next = temp;
    }
}
