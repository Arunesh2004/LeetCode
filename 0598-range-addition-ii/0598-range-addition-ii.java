class Solution {
    public int maxCount(int m, int n, int[][] ops) {

       int row = m;
       int col = n;

       for(int i = 0 ; i < ops.length ; i++){

            if(ops[i][0] < row){

                row = ops[i][0];

            }

            if(ops[i][1] < col){

                col = ops[i][1];

            }
       } 

       return row * col;
       
    }
}