class Solution {
    public int numIdenticalPairs(int[] nums) {
        
        int[] temp = new int[101];

        int result = 0;

        for(int i = 0 ; i < nums.length ; i++){

            result = result + temp[nums[i]];
            temp[nums[i]]++ ;

        }

        return result;

    }
}