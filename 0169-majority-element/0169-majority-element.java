class Solution {
    public int majorityElement(int[] nums) {
        
        int count = 1;
        int AssumedME = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == AssumedME) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    AssumedME = nums[i];
                    count = 1;
                }
            }
        }

        return AssumedME;
           
    }
}