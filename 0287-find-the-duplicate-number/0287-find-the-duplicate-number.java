class Solution {
    public int findDuplicate(int[] nums) {

        int result = -1;

        Arrays.sort(nums);

        for(int i = 1; i < nums.length ; i++){

            if (nums[i-1] == nums[i]) {
                    result = nums[i];
                    break;
                      
                }
        }

        return result;
        
    }
}