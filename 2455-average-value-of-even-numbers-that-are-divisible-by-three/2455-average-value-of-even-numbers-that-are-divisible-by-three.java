class Solution {
    public int averageValue(int[] nums) {

        int count = 0;
        int sum = 0;

        for(int i = 0 ; i < nums.length ; i++){

            if(nums[i]%3 == 0 && nums[i]>=0 && nums[i]%2==0){

                sum = sum + nums[i];
                count++;

            }
        }

        if (count == 0) {
            return 0;
        }

        return sum/count ;
        
    }
}