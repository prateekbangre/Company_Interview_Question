package company_interview_questions;

/**
 * @author prateek.bangre on 25/10/21.
 * @Project TestProject
 */
/*
array sorted and rotated
arr = {6,7,8,9,0,1,2,3,4,5}
find = 3
o/p = return index of 3 ->

start = 0
end = 9
mid = 4
6 <= 0 -> false

else
3>0

*/
public class GE_HealthCare_Question2 {

    public static void main(String[] args) {

        int[] arr = {6,7,8,9,10,11,12,0,1,2,3,4,5};
        int find = 9;

        int start = 0;
        int end = arr.length-1;

        while(start<=end){

            int mid = (start+end)/2;

            if(arr[mid] == find){
                System.out.println(mid);
                break;
            }else if(arr[start] <= arr[mid]){
                if(find >= arr[start] && find<arr[mid]){
                    end= mid - 1;
                }else{
                    start = mid + 1;
                }
            }else {
                if(find <= arr[end] && find>arr[mid]){
                    start= mid + 1;
                }else{
                    end = mid - 1;
                }
            }

        }



    }
}
