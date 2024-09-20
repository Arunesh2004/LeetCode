class Solution {
    public int[] twoSum(int[] arr, int target) {
         int sum = 0;

        for (int i = 1; i < arr.length; i++) {

            

            for (int j = 0; j < arr.length; j++) {
                sum = arr[i] + arr[j];
                if(sum == target){
                    return new int[]{i,j};
                }

            }

        }
        return new int[]{};
    }
}