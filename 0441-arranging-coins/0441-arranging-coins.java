class Solution {
    public int arrangeCoins(int n) {
        
        long count = 0;
        int k = 0;

        for(int i = 1 ; i <= n ; i++){

            count = count + i;
            k++;

            if(count > n){

                return k - 1;

            }
        }

        return k;

    }
}