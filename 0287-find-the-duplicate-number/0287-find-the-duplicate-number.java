class Solution {
    public int findDuplicate(int[] nums) {

        int[] hash = new int[nums.length];

        for(int num : nums) {

            if(hash[num] == 1) {
                return num;
            }

            hash[num] = 1;
        }

        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna