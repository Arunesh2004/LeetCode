class Solution {
    public int maxProfit(int[] prices) {
        
        int buyingPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0 ; i < prices.length ; i++){

            if(prices[i] < buyingPrice){ //here prices[i] is "selling price"

                buyingPrice = prices[i];

            }
            else if(prices[i] - buyingPrice > maxProfit){

                maxProfit = prices[i] - buyingPrice;

            }
        }

        return maxProfit;
    }
}