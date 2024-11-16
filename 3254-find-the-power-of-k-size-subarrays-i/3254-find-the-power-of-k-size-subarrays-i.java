class Solution {
    public int[] resultsArray(int[] nums, int k) {

        int n = nums.length;

        if(n == 1){

            return nums;

        }

        int[] results = new int[n - k + 1];

        int i = 0;

        while(i <= n - k){

            int max = nums[i];
            
            boolean isConsecutive = true;

            int j = i;

            while(j < i + k - 1){

                if (nums[j + 1] != nums[j] + 1) {

                    isConsecutive = false;

                }

                max = Math.max(max, nums[j + 1]);

                j++;

            }

            if (isConsecutive) {

                    results[i] = max;

                } 
                else {

                    results[i] = -1;

                }

            i++;

        }

        return results;

    }
}