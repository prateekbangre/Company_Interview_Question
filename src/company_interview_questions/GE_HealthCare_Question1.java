package company_interview_questions;

/**
 * @author prateek.bangre on 28/10/21.
 * @Project TestProject
 */
/*
Decimal to binary
11 -> 1011

11/2 > 5 => 1
5/2 => 2 => 1
2/2 => 1 => 0
1/2 => 0 => 1

after that count no of max zero in b/w two 1
101 -> 1
101001 -> 2
1000000 -> 0
*/
public class GE_HealthCare_Question1 {

    private static String getBinary(int num){

        StringBuilder str = new StringBuilder();
        while (num>0){
            int rem = num % 2;
            num = num/2;
            str.insert(0, rem);
        }
        return str.toString();
    }

    private static int getZeroCount(String str){

        int zeroCount = 0;
        int start = -1;
        str = "101001";
        for(int i=0; i<str.length(); ++i){
            if(str.charAt(i) == '1'){
                if(start != -1){
                    zeroCount = Math.max(zeroCount, i - start - 1);
                }
                start = i;
            }
        }
        return zeroCount;
    }

    public static void main(String[] args) {

        int no = 11;
        String str = getBinary(no);
        System.out.println(str);
        System.out.println(getZeroCount(str));
    }

}
