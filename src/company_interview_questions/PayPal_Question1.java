package company_interview_questions;

/**
 * @author prateek.bangre on 02/12/21.
 * @Project Company_Interview_Question
 */
//url: https://www.hackerearth.com/problem/algorithm/beautiful-numbers-05de0f51-101121ca/
public class PayPal_Question1 {

    static long solve(int l, int r){
        // Your code goes here
        long sum = 0;
        for(int i=l; i<=r; ++i){
            if(isBeautifulNo(i)){
                sum += i;
            }
        }
        return sum;
    }


    static boolean isBeautifulNo(int num){
        if(num == 1 || num == 7){
            return true;
        }
        int sum = num;
        int squareSum = num;

        while(sum>9){
            sum = 0;
            while(squareSum>0){
                int rem = squareSum%10;
                sum += rem*rem;
                squareSum /= 10;
            }
            if(sum == 1)
                return true;
            squareSum = sum;
        }
        if(sum == 7)
            return true;
        return false;
        /*
        //was tring this approch
        if(num<=0) return false;
        while(true){
            int sum=0;
            while(num!=0){
                sum+=(num%10)*(num%10);
                num=num/10;
            }
            if(sum/10==0){
                if(sum==1||sum==7) return true;
                else return false;
            }
            num=sum;
        }
         */
    }

    public static void main(String[] args) {
//            int l = 31, r = 32;
            int l = 7, r = 7;
            System.out.println(solve(l, r));
    }
}
