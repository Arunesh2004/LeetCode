class Solution {
    public int thirdMax(int[] nums) {

        int max1 = 0;
        int max2 = 0;
        int max3 = 0;

        for(int i = 0 ; i < nums.length ; i++){

            if (nums[i] == max1 || nums[i] == max2 || nums[i] == max3) {
                continue;
            }

            if(max1 == 0 || nums[i] > max1){

                max3 = max2;
                max2 = max1;
                max1 = nums[i];

            }

            else if(max2 == 0 || nums[i] > max2){

                max3 = max2;
                max2 = nums[i];

            }

            else if(max3 == 0 || nums[i] > max3){

                max3 = nums[i];

            }
        }

        return max3 == 0 ? max1 : max3;
        
    }
}