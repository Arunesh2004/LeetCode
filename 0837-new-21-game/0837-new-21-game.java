class Solution {
    public double new21Game(int n, int k, int maxPts) {

        if(k == 0 || n >= k - 1 + maxPts){

            return 1;

        }

        double dp[] = new double[n + 1];

        dp[0] = 1;

        double window = 1;
        double result = 0;

        for(int i = 1 ; i <= n ; i++){

            dp[i] = window / maxPts ;

            if(i < k){

                window = window + dp[i];

            }

            else{

                result = result + dp[i];

            }

            int p = i - maxPts;

            if(p >= 0 && p < k){

                window = window - dp[p];

            }
        }

        return result;
        
    }
}