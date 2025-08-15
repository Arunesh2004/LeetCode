class Solution {
    public boolean isPowerOfFour(int n) {

        if(n <= 0){

            return false;

        }

        else if(n == 1 || n % 4 == 0){

            return true;

        }

        else {

            return false;

        }
        
    }
}