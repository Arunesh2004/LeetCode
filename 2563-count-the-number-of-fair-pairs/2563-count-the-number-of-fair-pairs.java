class Solution {
    public long countFairPairs(int[] arr, int lower, int upper) {
        
        Arrays.sort(arr);

        int ans = 0;

        for(int i = 0 ; i < arr.length ; i++){

            int low = lower - arr[i];
            int up = upper - arr[i];

            int LeftIndex = lowerValue(arr, i + 1, arr.length, low);
            int RightIndex = upperValue(arr, i + 1, arr.length, up);

            ans = ans + (RightIndex - LeftIndex);

        }

        return ans;

    }

    private int lowerValue(int[] arr, int start, int end, int target){

        while(start < end){

            int mid = start + (end - start)/2;

            if(arr[mid] < target){

                start = mid + 1;

            }
            else{

                end = mid;

            }
        }

        return start;

    }

    private int upperValue(int[] arr, int start, int end, int target){

        while(start < end){

            int mid = start + (end - start)/2;

            if(arr[mid] <= target){

                start = mid + 1;

            }
            else{

                end = mid;

            }
        }

        return start;
        
    }
}