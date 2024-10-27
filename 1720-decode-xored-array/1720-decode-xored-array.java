class Solution {
    public int[] decode(int[] arr, int f) {
        
        int[] ans = new int[arr.length + 1];

        ans[0] = f;

        for(int i = 0 ; i < arr.length ; i++){

            ans[i + 1] = ans[i] ^ arr[i];

        }

        return ans;
        
    }
}