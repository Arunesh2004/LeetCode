class Solution {
    public int findDuplicate(int[] nums) {

        boolean[] SeenAlready = new boolean[nums.length + 1];

        for(int i = 0 ; i < nums.length ; i++){
            
            if(SeenAlready[nums[i]]){

                return nums[i];

            }

            SeenAlready[nums[i]] = true;

        }

        return -1;
    }
}