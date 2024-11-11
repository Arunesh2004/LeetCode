class Solution {
    public void moveZeroes(int[] nums) {

        int elementPos = 0;

        for(int i = 0 ; i <  nums.length ; i++){

            if(nums[i] != 0){
                
                nums[elementPos] = nums[i];

                elementPos++;

            }

        }

        for(int i = elementPos ; i < nums.length ; i++){

            nums[i] = 0;
            
        }
        
    }
}