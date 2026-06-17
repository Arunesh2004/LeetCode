class Solution {
    public boolean isPerfectSquare(int num) {

        for(long i = 1; i <= num; i++) {

            long square = i * i;

            if(square == num) {
                return true;
            }

            if(square > num) {
                return false;
            }
        }

        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna