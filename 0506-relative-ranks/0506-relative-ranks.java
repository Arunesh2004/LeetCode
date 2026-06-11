class Solution {
    public String[] findRelativeRanks(int[] score) {

        int n = score.length;
        String[] ans = new String[n];

        for(int i = 0; i < n; i++) {

            int rank = 1;

            for(int j = 0; j < n; j++) {

                if(score[j] > score[i]) {
                    rank++;
                }
            }

            if(rank == 1) {
                ans[i] = "Gold Medal";
            }
            else if(rank == 2) {
                ans[i] = "Silver Medal";
            }
            else if(rank == 3) {
                ans[i] = "Bronze Medal";
            }
            else {
                ans[i] = String.valueOf(rank);
            }
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna