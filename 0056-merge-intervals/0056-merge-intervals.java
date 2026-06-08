import java.util.*;

public class Solution {

    public static int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> ans = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {

            int start = intervals[i][0];
            int end = intervals[i][1];

            if (!ans.isEmpty() && end <= ans.get(ans.size() - 1)[1]) {
                continue;
            }

            for (int j = i + 1; j < intervals.length; j++) {

                if (intervals[j][0] <= end) {

                    end = Math.max(end, intervals[j][1]);

                } else {

                    break;
                }
            }

            ans.add(new int[]{start, end});
        }

        return ans.toArray(new int[ans.size()][]);
    }

    public static void main(String[] args) {

        int[][] intervals = {
                {1, 3},
                {2, 6},
                {8, 10},
                {15, 18}
        };

        int[][] result = merge(intervals);

        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna