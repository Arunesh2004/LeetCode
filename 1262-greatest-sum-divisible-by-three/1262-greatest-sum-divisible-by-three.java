class Solution {

    public int maxSumDivThree(int[] nums) {

        int sum = 0;

        int r1Min1 = Integer.MAX_VALUE;
        int r1Min2 = Integer.MAX_VALUE;

        int r2Min1 = Integer.MAX_VALUE;
        int r2Min2 = Integer.MAX_VALUE;

        for(int num : nums) {

            sum += num;

            if(num % 3 == 1) {

                if(num < r1Min1) {
                    r1Min2 = r1Min1;
                    r1Min1 = num;
                }
                else if(num < r1Min2) {
                    r1Min2 = num;
                }
            }

            else if(num % 3 == 2) {

                if(num < r2Min1) {
                    r2Min2 = r2Min1;
                    r2Min1 = num;
                }
                else if(num < r2Min2) {
                    r2Min2 = num;
                }
            }
        }

        if(sum % 3 == 0) {
            return sum;
        }

        if(sum % 3 == 1) {

            int option1 = (r1Min1 == Integer.MAX_VALUE)
                          ? 0
                          : sum - r1Min1;

            int option2 = (r2Min1 == Integer.MAX_VALUE ||
                           r2Min2 == Integer.MAX_VALUE)
                          ? 0
                          : sum - r2Min1 - r2Min2;

            return Math.max(option1, option2);
        }

        int option1 = (r2Min1 == Integer.MAX_VALUE)
                      ? 0
                      : sum - r2Min1;

        int option2 = (r1Min1 == Integer.MAX_VALUE ||
                       r1Min2 == Integer.MAX_VALUE)
                      ? 0
                      : sum - r1Min1 - r1Min2;

        return Math.max(option1, option2);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna