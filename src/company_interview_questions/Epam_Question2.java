package company_interview_questions;

/**
 * @author prateek.bangre on 09/10/21.
 * @Project TestProject
 */
/*
    3rd largest no from a list with unsorted order
*/
public class Epam_Question2 {

    public static void main(String[] args) {

        int[] arr = {2, 10, 14, 5, 20, 15};

        int first = arr[0];
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

       for(int value : arr){

            if(value > first){
                third = second;
                second = first;
                first = value;
            }else if(value > second){
                third = second;
                second = value;
            }else  if(value > third){
                third = value;
            }
        }
        System.out.println(third);
    }

}
