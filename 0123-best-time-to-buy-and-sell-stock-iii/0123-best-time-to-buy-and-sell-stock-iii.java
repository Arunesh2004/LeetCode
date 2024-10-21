class Solution {
    public int maxProfit(int[] prices) {
        
        int n = prices.length;

        if(n == 0){

            return 0;

        }

        int[] left = new int[n];
        int[] right = new int[n];

        int leftMin = prices[0];
        for(int i = 1 ; i < n ; i++){

            if(prices[i] - leftMin > left[i - 1]){

                left[i] = prices[i] - leftMin;

            }
            else{

                left[i] = left[i - 1];

            }

            if(prices[i] < leftMin){

                leftMin = prices[i];

            }
        }

        int rightMax = prices[n - 1];
        for(int i = n - 2 ; i >= 0 ; i--){

            if(rightMax - prices[i] > right[i + 1]){

                right[i] = rightMax - prices[i];

            }
            else{

                right[i] = right[i + 1];

            }

            if(prices[i] > rightMax){

                rightMax = prices[i];
                
            }
        }

        int profit = right[0];
        for(int i = 1 ; i < n ; i++){

            if(left[i - 1] + right[i] > profit){

                profit = left[i - 1] + right[i];

            }
        }

        return profit;

    }
}