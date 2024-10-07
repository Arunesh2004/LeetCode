class Solution {
    public int[] findErrorNums(int[] nums) {

        Arrays.sort(nums);

        int repeatedNum = -1;
        int missingNum = -1;

        int n = nums.length;
        int totalSum = n * (n + 1) / 2;
        int ArrSum = 0;

        for(int i = 0 ; i < nums.length ; i++){

            ArrSum = ArrSum + nums[i];

            if(i > 0 && nums[i] == nums[i - 1]){

                repeatedNum = nums[i]; // repeated number

            }
        }

        // totalsum = sum of first n natural numbers
        // ArrSum = sum of all the elements in the array
        // repeatedNum = number that appears twice
        

        missingNum = (totalSum - (ArrSum - repeatedNum)); 

        return new int[]{repeatedNum , missingNum};
        
    }
}