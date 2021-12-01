package company_interview_questions;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author prateek.bangre on 28/10/21.
 * @Project TestProject
 */
/*
0 - empty
1 - humans
2 - zombies
human present near up, down, left, and right will convert into zombies.
So calculate how many day it will take to turn respected condition human to zombies.

2 1 0 1
1 1 0 2
0 0 0 1
0 1 0 1

2 2 0 2
2 1 0 2
0 0 0 2
0 1 0 1

2 2 0 2
2 2 0 2
0 0 0 2
0 1 0 2
*/
public class PayU_Question3 {

    int noOfDays(int[][] matrix){

        Queue<int[]> queue = new LinkedList<>();
        for(int i=0; i<matrix.length; ++i){

            for(int j=0; j<matrix[0].length; ++j){

                if(matrix[i][j] == 2){
                    queue.add(new int[]{i, j});
                }
            }
        }

        int[][] direction = {{0,1}, {0,-1}, {-1,0}, {1,0}};
        int noOfDays = 0;
        while(!queue.isEmpty()){
            ++noOfDays;
            int size = queue.size();
            for(int i=0; i<size; ++i){
                int[] position = queue.poll();

                for(int[] dir : direction){
                    int x = position[0] + dir[0];
                    int y = position[1] + dir[1];

                    if(x>=0 && y<matrix.length && matrix[x][y]==1){
                        matrix[x][y]=2;
                        queue.add(new int[]{x, y});
                    }
                }
            }
        }
        return noOfDays;
    }
}
