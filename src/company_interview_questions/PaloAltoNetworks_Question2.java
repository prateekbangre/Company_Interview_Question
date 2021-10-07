package company_interview_questions;

/**
 * @author prateek.bangre on 21/09/21.
 * @Project DataStructure_Algorithms
 */
//url: https://algo.monster/problems/particle_velocity
public class PaloAltoNetworks_Question2 {

    public int solution(int[] A) {
        // write your code in Java SE 8
        int totalPeriods = 0;
        int size = A.length;

        for(int i=0; i<size; ++i){

            for(int count=0; i+2<size && A[i+1]-A[i] == A[i+2]-A[i+1]; ++i){
                count++;
                totalPeriods += count;
            }
        }
        return totalPeriods<1000000000 ? totalPeriods : -1;
    }
}
