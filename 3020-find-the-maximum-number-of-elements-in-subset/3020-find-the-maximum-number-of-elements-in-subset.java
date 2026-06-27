import java.util.*;

class Solution {
    public int maximumLength(int[] nums) {

        HashMap<Long, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put((long) num, map.getOrDefault((long) num, 0) + 1);
        }

        int ans = 1;

        if (map.containsKey(1L)) {
            int ones = map.get(1L);

            if (ones % 2 == 0) {
                ones--;
            }

            ans = Math.max(ans, ones);
        }

        for (long x : map.keySet()) {

            if (x == 1) {
                continue;
            }

            long curr = x;
            int len = 0;

            while (map.getOrDefault(curr, 0) >= 2) {

                len += 2;

                if (curr > 1000000000L) {
                    break;
                }

                curr = curr * curr;
            }

            if (map.containsKey(curr)) {
                len++;
            } else {
                len -= 1;
            }

            ans = Math.max(ans, len);
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna