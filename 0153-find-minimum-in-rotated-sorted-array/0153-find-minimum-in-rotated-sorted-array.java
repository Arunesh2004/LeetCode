class Solution {
    public int findMin(int[] arr) {

        if (arr == null || arr.length == 0){

            return -1;
        }

        int min = arr[0];

        for(int i = 1 ; i < arr.length ; i++){

            if(arr[i] < min){

                min = arr[i];

            }
        }

        return min;
    }
}