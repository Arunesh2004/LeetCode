class Solution {
    public int waysToSplitArray(int[] nums) {
        
        long total = 0;

        for(int num : nums){

            total = total + num;

        }

        int count = 0;

        long x = 0;

        for(int i = 0 ; i < nums.length - 1 ; i++){

            x = x + nums[i];

            total = total - nums[i];

            if(x >= total){

                count++;

            }
        }

        return count;
    }
}