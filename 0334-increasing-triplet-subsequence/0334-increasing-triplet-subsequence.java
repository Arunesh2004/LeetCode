class Solution {
    public boolean increasingTriplet(int[] nums) {
        
        for(int i = 1 ; i < nums.length ; i++){

            if((nums[i - 1] < nums[i]) && (nums[i] < nums[i + 1])){

                return true;

            }
        }

        return false;
        
    }
}