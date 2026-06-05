class Solution {
    public int[] twoSum(int[] arr, int target) {
         int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            

            for (int j = i+1; j < arr.length; j++) {
                sum = arr[i] + arr[j];
                if(sum == target){
                    return new int[]{i,j};
                }

            }

        }
        return new int[]{};
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna