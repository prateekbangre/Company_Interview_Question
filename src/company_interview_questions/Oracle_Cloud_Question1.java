package company_interview_questions;

/**
 * @author prateek.bangre on 23/09/21.
 * @Project DataStructure_Algorithms
 */
/*
 * There are n cities. Some of them are connected, while some are not. If city a is connected directly with city b, and city b is connected directly with city c, then city a is connected indirectly with city c.

A province is a group of directly or indirectly connected cities and no other cities outside of the group.

You are given an n x n matrix isConnected where isConnected[i][j] = 1 if the ith city and the jth city are directly connected, and isConnected[i][j] = 0 otherwise.

Return the total number of provinces.

Input: isConnected = [[1,1,0]    0->1    2->0 = 1 province
                     ,[1,1,0]
                     ,[0,0,1]]   0 -> 1->2  = 1
Output: 2

Input: isConnected = [[1,1,0]
                     ,[1,1,1]
                     ,[0,1,1]]
Output: 1

Input: isConnected = [[1,0,0]
                     ,[0,1,0]
                     ,[0,0,1]]
Output: 3
 */
class Oracle_Cloud_Question1 {

    private static int getProvinces(int[][] arr){

        int count = 0;

        int row = arr.length;
        boolean[] visited = new boolean[row];

        for(int i=0; i<row; ++i){

            if(!visited[i]){

                dfsMethod(arr, visited, i);
                count++;
            }
        }


        return count;
    }

    private static void dfsMethod(int[][] arr, boolean[] visited, int row){

        visited[row] = true;

        for(int i=0; i<arr[row].length; ++i){

            if(!visited[i] && arr[row][i] == 1){
                dfsMethod(arr, visited, i);
            }
        }

    }


    public static void main(String[] args) {
        // ArrayList<String> strings = new ArrayList<String>();
        // strings.add("Hello, World!");
        // strings.add("Welcome to CoderPad.");
        // strings.add("This pad is running Java " + Runtime.version().feature());

        // for (String string : strings) {
        //   System.out.println(string);
        // }

        // int[][] arr = new int[][]{{1,0,0}
        //                  ,{0,1,0}
        //                  ,{0,0,1}};
        int[][] arr = new int[][]{
                {1,1,0}
                ,{1,1,1}
                ,{0,1,1}};


        System.out.println(getProvinces(arr));


    }
}
