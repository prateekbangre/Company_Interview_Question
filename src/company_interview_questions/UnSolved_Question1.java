package company_interview_questions;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author prateek.bangre on 08/10/21.
 * @Project Company_Interview_Question
 */
/*
Find all the tuples which satisfy the formula a^3 + b^3 = c^3 where 1000 > a,b,c > 0.
print the output as a, b, c tuples
note:
i=1-> 1000
j= 1 -> 1000
*/
public class UnSolved_Question1 {

    static class Match{
        int a;
        int b;
        Match(int a, int b){
            this.a = a;
            this.b = b;
        }
    }

    public static void main(String[] args) {

        int no = 1000;
        HashMap<Integer, ArrayList<Match>> map = new HashMap<>();

        for (int i=1; i<= no; ++i){

            for(int j=1; j<=no; ++j){

                int sum = (int)(Math.pow(i, 3) + Math.pow(j, 3));
                if(map.containsKey(sum)){
                    ArrayList<Match> match = map.get(sum);
                    for(Match m: match){
//                        for (int c=1; c<=1000;++c){
//                            int value = (int)Math.pow(c, 3);
//                            if (sum == value){
//                                System.out.println(m.a +", "+m.b+", "+c);
//                            }
//                        }
                        System.out.println(m.a +", "+m.b);
                    }
                }else {
                    ArrayList<Match> match = new ArrayList<>();
                    map.put(sum, match);
                }

                map.get(sum).add(new Match(i, j));

            }
        }

    }
}
