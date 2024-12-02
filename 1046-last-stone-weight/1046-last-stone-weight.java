class Solution {
    public int lastStoneWeight(int[] stones) {
        
        int n = stones.length;

        
        while (true) {
            
            int max1 = -1, max2 = -1; 

            int max1Value = 0, max2Value = 0; 

            for (int i = 0; i < n; i++) {

                if (stones[i] > max1Value) {
                    
                    max2 = max1;
                    max2Value = max1Value;

                    max1 = i;
                    max1Value = stones[i];

                } 
                else if (stones[i] > max2Value) {

                    max2 = i;
                    max2Value = stones[i];

                }
            }

            
            if (max2Value == 0) {

                return max1Value; 

            }

            
            if (max1Value == max2Value) {

                
                stones[max1] = 0;
                stones[max2] = 0;

            } else {
               
                stones[max1] = max1Value - max2Value;
                stones[max2] = 0;
                
            }
        }
    }
}