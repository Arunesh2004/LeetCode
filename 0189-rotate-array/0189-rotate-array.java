class Solution {
    public void rotate(int[] arr, int k) {

        int n = arr.length;

        if(n == 1 && k%n == 0){

            return ;

        }

        k = k%n;

        RotateArray(arr , 0 , n - 1);

        RotateArray(arr , 0 , k - 1);

        RotateArray(arr , k , n -1);
        

    }

    void RotateArray(int[] arr , int start , int end){

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }
}