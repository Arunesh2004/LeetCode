class Solution {

    public String longestDiverseString(int a, int b, int c) {

        StringBuilder ans = new StringBuilder();

        while(true) {

            int n = ans.length();

            boolean addA = !(n >= 2 &&
                             ans.charAt(n - 1) == 'a' &&
                             ans.charAt(n - 2) == 'a');

            boolean addB = !(n >= 2 &&
                             ans.charAt(n - 1) == 'b' &&
                             ans.charAt(n - 2) == 'b');

            boolean addC = !(n >= 2 &&
                             ans.charAt(n - 1) == 'c' &&
                             ans.charAt(n - 2) == 'c');

            if(a >= b && a >= c && addA && a > 0) {
                ans.append('a');
                a--;
            }
            else if(b >= a && b >= c && addB && b > 0) {
                ans.append('b');
                b--;
            }
            else if(c >= a && c >= b && addC && c > 0) {
                ans.append('c');
                c--;
            }
            else if(addA && a > 0) {
                ans.append('a');
                a--;
            }
            else if(addB && b > 0) {
                ans.append('b');
                b--;
            }
            else if(addC && c > 0) {
                ans.append('c');
                c--;
            }
            else {
                break;
            }
        }

        return ans.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna