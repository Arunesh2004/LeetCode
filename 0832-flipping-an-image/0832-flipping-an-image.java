class Solution {
    public int[][] flipAndInvertImage(int[][] arr) {

        for (int row = 0 ; row < arr.length ; row++) {
            for (int col = 0 ; col < arr[row].length ; col++) {

                if(arr[row][col] == 0){

                    arr[row][col] = 1;

                }

                else if(arr[row][col] == 1){

                    arr[row][col] = 0;

                }  
            }
        }


        int row= arr.length;
        int col = arr[0].length;

        for(int i = 0 ; i < row ; i++){

            int j = 0;
            int k = col - 1;

            while(j < k){

                int temp = arr[i][j];
                arr[i][j] = arr[i][k];
                arr[i][k] = temp;

                j++;
                k--;
            }
        }

        return arr;
        
    }
}