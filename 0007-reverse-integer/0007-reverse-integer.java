class Solution {
    public int reverse(int x) {

        int sign = 0;

        if(x < 0){

            sign = -1;
            x = sign*x;

        }

        else{

            sign = 1;

        }

        int result = 0;
        int n = x;

        while(n != 0){

            int remainder = n%10;

            if (result > (Integer.MAX_VALUE - remainder) / 10) {
                return 0; 
            }

            result = result*10 + remainder;
            n = n/10;

        }

        return result*sign;

        
    }
}