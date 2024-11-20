class Solution {
    public int findLucky(int[] arr) {

        Arrays.sort(arr);
        
        int count = 1;

        int ans = -1;

        for(int i = 1 ; i <= arr.length ; i++){

            if(i < arr.length && arr[i] == arr[i - 1]){

                count++;

            }

            else{

                if(count == arr[i - 1]){

                    ans = Math.max(ans, arr[i - 1]);

                }

                count = 1;

            }
        }

        return ans;

    }
}