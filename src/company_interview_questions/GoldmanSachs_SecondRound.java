package company_interview_questions;

/**
 * @author prateek.bangre on 13/09/21.
 * @Project DataStructure_Algorithms
 */
/* Problem Name is &&& Optimal Path &&& PLEASE DO NOT REMOVE THIS LINE. */

/*
** Instructions to candidate.
**  1) You are an avid rock collector who lives in southern California. Some rare
**     and desirable rocks just became available in New York, so you are planning
**     a cross-country road trip. There are several other rare rocks that you could
**     pick up along the way.
**
**     You have been given a grid filled with numbers, representing the number of
**     rare rocks available in various cities across the country.  Your objective
**     is to find the optimal path from So_Cal to New_York that would allow you to
**     accumulate the most rocks along the way.
**
**     Note: You can only travel either north (up) or east (right).
**  2) Consider adding some additional tests in doTestsPass().
**  3) Implement optimalPath() correctly.
**  4) Here is an example:
**                                                           ^
**                 {{0,0,0,0,5}, New_York (finish)           N
**                  {0,1,1,1,0},                         < W   E >
**   So_Cal (start) {2,0,0,0,0}}                             S
**                                                           v
**   The total for this example would be 10 (2+0+1+1+1+0+5).


  0 0 0 5
1
0 7 7 7
2 2 2 2 7

*/
class GoldmanSachs_SecondRound
{

    private static int optimalPathWork(Integer[][] grid){

        int length = grid.length;
        int[][] sum = new int[length][grid[0].length];


        sum[length-1][0] = grid[length-1][0];
        for(int i=1; i<length; ++i){
            sum[length-1][i] = sum[length-1][i-1] + grid[length-1][i];

        }

        for(int j=length-2; j>=0; --j){
            sum[j][0] = sum[j+1][0] + grid[j][0];
        }

        for(int i=length-2; i>=0; --i){

            for(int j=1; j<grid[0].length; j++){
                sum[i][j] = Integer.max(sum[i+1][j], sum[i][j-1]) + grid[i][j];
                // System.out.print(sum[i][j] + ", ");
            }
            // System.out.println("");
        }


        // System.out.println(sum[0][grid[0].length-1]);
        return sum[0][grid[0].length-1];
    }

    /*
     **  Find the optimal path.
     */
    public static Integer optimalPath(Integer[][] grid)
    {
        // Todo: Implement optimalPath
        if(grid != null && grid.length > 0 && grid[0].length > 0){
            return optimalPathWork(grid);
        }

        return 0;
    }

    /*
     **  Returns true if the tests pass. Otherwise, returns false;
     */
    public static boolean doTestsPass()
    {
        boolean result = true;
        // Base test case
        result &= optimalPath(new Integer[][]{{0,0,0,0,5},
                {0,1,1,1,0},
                {2,0,0,0,0}}) == 10;
        // Random numbers
        result &= optimalPath(new Integer[][]{{1,3,2,0,2,1,8},
                {3,4,1,2,0,1,1},
                {1,1,1,2,3,2,1},
                {1,0,1,1,4,2,1}}) == 25;
        // All 0's
        result &= optimalPath(new Integer[][]{{0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0}}) == 0;
        // Many optimal paths
        result &= optimalPath(new Integer[][]{{1,1,1,1,1},
                {1,0,1,0,1},
                {1,0,1,0,1},
                {1,1,1,1,1}}) == 8;
        // Empty grid
        result &= optimalPath(new Integer[][]{{}}) == 0;

        return result;
    }

    /*
     **  Execution entry point.
     */
    public static void main(String[] args)
    {
        if(doTestsPass())
        {
            System.out.println("All tests pass");
        }
        else
        {
            System.out.println("Tests fail.");
        }
    }
}
