class Solution {
    public boolean hasAlternatingBits(int n) {
        
        int prevBit = n % 2; 

        n /= 2; 

        while (n > 0) {

            int currBit = n % 2; 

            if (currBit == prevBit) {

                return false; 
                
            }

            prevBit = currBit; 
            n /= 2; 

        }
        
        return true;

    }
}