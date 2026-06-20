class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {

        int total = 0;

        for(int num : arr) {
            total += num;
        }

        if(total % 3 != 0) {
            return false;
        }

        int target = total / 3;

        int currSum = 0;
        int parts = 0;

        for(int num : arr) {

            currSum += num;

            if(currSum == target) {
                parts++;
                currSum = 0;
            }
        }

        return parts >= 3;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna