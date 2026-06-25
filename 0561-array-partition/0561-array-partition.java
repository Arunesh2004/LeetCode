import java.util.Arrays;

class Solution {

    public int arrayPairSum(int[] nums) {

        Arrays.sort(nums);

        int sum = 0;

        for(int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }

        return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna