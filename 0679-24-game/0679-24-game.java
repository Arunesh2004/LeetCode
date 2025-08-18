class Solution {
    private static final double EPSILON = 1e-6;
    private static final int TARGET = 24;

    public boolean judgePoint24(int[] cards) {
        // Convert to list of doubles for division handling
        List<Double> nums = new ArrayList<>();
        for (int card : cards) {
            nums.add((double) card);
        }
        return solve(nums);
    }

    private boolean solve(List<Double> nums) {
        if (nums.size() == 1) {
            return Math.abs(nums.get(0) - TARGET) < EPSILON;
        }

        // Try every pair of numbers
        for (int i = 0; i < nums.size(); i++) {
            for (int j = 0; j < nums.size(); j++) {
                if (i == j) continue;

                List<Double> nextRound = new ArrayList<>();

                // Add all other numbers except i and j
                for (int k = 0; k < nums.size(); k++) {
                    if (k != i && k != j) {
                        nextRound.add(nums.get(k));
                    }
                }

                // Try all 4 operations
                for (double num : compute(nums.get(i), nums.get(j))) {
                    nextRound.add(num);
                    if (solve(nextRound)) return true;
                    nextRound.remove(nextRound.size() - 1);
                }
            }
        }
        return false;
    }

    private List<Double> compute(double a, double b) {
        List<Double> results = new ArrayList<>();
        results.add(a + b);
        results.add(a - b);
        results.add(b - a);
        results.add(a * b);
        if (Math.abs(b) > EPSILON) results.add(a / b);
        if (Math.abs(a) > EPSILON) results.add(b / a);
        return results;
    }
}
