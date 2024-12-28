class Solution {
    public int mostFrequentEven(int[] nums) {

        int count = -1;
        int maxCount = 0;
        
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] % 2 == 0) {

                int currentNum = nums[i];

                int frequency = 0;

                for (int j = 0; j < nums.length; j++) {

                    if (nums[j] == currentNum) {

                        frequency++;

                    }
                }

                if (frequency > maxCount || (frequency == maxCount && currentNum < count)) {

                    maxCount = frequency;

                    count = currentNum;

                }
            }
        }

        return count;
    }
}
