class Solution {
    public boolean repeatedSubstringPattern(String s) {

        int n = s.length();

        for(int len = 1; len <= n / 2; len++) {

            // length must divide n
            if(n % len != 0) {
                continue;
            }

            String sub = s.substring(0, len);

            StringBuilder sb = new StringBuilder();

            int times = n / len;

            for(int i = 0; i < times; i++) {
                sb.append(sub);
            }

            if(sb.toString().equals(s)) {
                return true;
            }
        }

        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna