class Solution {
    public long minimumCost(String s) {
         
        char[] arr = s.toCharArray();

        int n = arr.length;

        long minCost = 0;

        for(int i = 1; i < n ; i++){

            if(arr[i - 1] != arr[i]){

                minCost += Math.min(i, n - i);

            }
        }

        return minCost;
        
    }
}