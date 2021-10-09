package company_interview_questions;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author prateek.bangre on 09/10/21.
 * @Project Company_Interview_Question
 */
/*
url: https://leetcode.com/problems/coin-change/
 find the Minimum number of Coins
 A= {1, 2, 5} value=11

*/
public class DBS_Question2 {
    public static void main(String[] args) {

//        Integer[] coins = {1,2,5}; int value = 9;
//        Integer[] coins = {2}; int value = 3;
//        Integer[] coins = {1}; int value = 0;
//        Integer[] coins = {1}; int value = 1;
        Integer[] coins = {1}; int value = 2;
        Arrays.sort(coins, Collections.reverseOrder());

        for (int coin : coins){
            int total = value/coin;
            value = value%coin;
            System.out.println(coin+"-> "+total);
        }
    }
}
