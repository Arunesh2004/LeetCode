class Solution {
    public int lengthOfLastWord(String s) {

        int i = s.length() - 1;

        while(i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        int len = 0;

        while(i >= 0 && s.charAt(i) != ' ') {
            len++;
            i--;
        }

        return len;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna