class Solution {
    public int findLengthOfShortestSubarray(int[] arr) {
         
        int n = arr.length;
        int start = 0;
        int end = n - 1;

        while(start < end && arr[start] <= arr[start + 1]){

            start ++;

        }

        if(start == end){

            return 0;

        }

        while(end > 0 && arr[end] >= arr[end - 1]){

            end --;

            if(end == 0){

                return n-1;

            }

        }

        int res = Math.min(n-1-start, end);

        int i = 0;
        int j = end;

        while(i <= start && j < n){

            if(arr[j] >= arr[i]){

                res = Math.min(res, j-i-1);
                i++;

            }

            else{

                j++;

            }
        }

        return res;

    }
}