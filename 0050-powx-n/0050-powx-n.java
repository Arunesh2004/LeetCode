class Solution {
    public double myPow(double x, int n) {


        if (n == Integer.MIN_VALUE) {

            return 1 / myPow(x, Integer.MAX_VALUE) / x;
            
        }

        if (n < 0) {

            x = 1/x;
            n = -n;

        }

        double res = 1.0;

        while (n > 0) {

            if (n % 2 == 1) {
                  
                res *= x;

            }

            x *= x;
              
            n /= 2;  

        }

        return res;
    }
}