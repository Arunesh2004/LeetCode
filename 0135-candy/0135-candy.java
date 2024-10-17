class Solution {
    public int candy(int[] r) {

        int[] ans = new int[r.length];

        for(int i = 0 ; i < ans.length ; i++){

            ans[i] = 1;

        }

        for(int i = 1 ; i < r.length ; i++){

            if(r[i-1] < r[i]){

                ans[i] = ans[i - 1] + 1;

            }
        }

        for(int j = r.length - 2 ; j > 0 ; j--){

            if(r[j + 1] > r[j]){

                ans[j - 1] = ans[j] + 1;

            }
        }

        int totalCandies = 0;

        for(int k = 0 ; k < ans.length ; k++){

            totalCandies = totalCandies + ans[k];
        }

        return totalCandies;
        
    }
}