package company_interview_questions;

import java.util.TreeSet;

/**
 * @author prateek.bangre on 08/10/21.
 * @Project DataStructure_Algorithms
 */
/*
Farthest from zero
You are given an integer array A of size N.
Task Write a program to print the farthest element from 0. If there are multiple elements, print the number with the least value.

Input format
The first line contains a single integer N denoting the size of the array A.
The next line contains N integers denoting the elements of the array A.

Output format
Print the farthest element from 0.

Sample input 1
5
1 2 3 4 5
Sample Output1
5
*/
public class WissenTechnology_Question1 {

    public static void main(String[] args) {
        int[] input = { 1, 2, 3, 4, 10, 10 };
//        int[] input = { 1, 2, 3, 4, 5 };
        System.out.println(farthestFromZero(input));
    }

    private static int farthestFromZero(int[] input) {

        boolean flag = true;
        TreeSet<Integer> toTreeSet = new TreeSet<Integer>();

        for (int eachVal : input) {
            if (!toTreeSet.contains(eachVal)) {
                toTreeSet.add(eachVal);
            } else {
                flag = false;
            }
        }

        return flag ? toTreeSet.last() : toTreeSet.first();

    }
}
