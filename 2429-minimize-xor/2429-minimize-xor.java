class Solution {
    public int minimizeXor(int num1, int num2) {

        int setBitsNum2 = Integer.bitCount(num2);
        int result = 0;

       
        for (int i = 31; i >= 0; i--) {

            if ((num1 >> i & 1) == 1 && setBitsNum2 > 0) {

                result += Math.pow(2, i);  
                setBitsNum2--;  

            }
        }

        for (int i = 0; i < 32; i++) {

            if (setBitsNum2 > 0 && (result >> i & 1) == 0) {

                result += Math.pow(2, i);  
                setBitsNum2--;  
                
            }
        }

        return result;
    }
}
