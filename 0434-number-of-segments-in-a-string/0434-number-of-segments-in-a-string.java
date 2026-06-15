class Solution {
    public int countSegments(String s) {

        s = s.trim();

        if(s.length() == 0) {
            return 0;
        }

        return s.split("\\s+").length;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna