class Solution {
    public int findNonMinOrMax(int[] nums) {

        if(nums.length < 3){

            return - 1;

        }

        int max = nums[0];
        int min = nums[0];

        for(int i = 1 ; i < nums.length ; i++){

            if(nums[i] > max){

                max = nums[i];

            }

            if(nums[i] < min){

                min = nums[i];

            }
        }

        for(int i = 0 ; i < nums.length ; i++){

            if(nums[i] != max && nums[i] != min){

                return nums[i];

            }
        }

        return -1;
        
    }
}