class Solution {
    public int maximumWealth(int[][] accounts) {

        int ans = Integer.MIN_VALUE;

        for(int person = 0; person < accounts.length ; person++){

            int Sum = 0;

            for(int account = 0; account < accounts[person].length ; account++){

                Sum = Sum + accounts[person][account];

            }

            if(Sum > ans){

                ans = Sum;
            }
        }

        return ans;
        
    }
}