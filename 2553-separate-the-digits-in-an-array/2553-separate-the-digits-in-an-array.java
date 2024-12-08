class Solution {
    public int[] separateDigits(int[] nums) {
        
        int totalDigits = 0;

        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];

            while (num > 0) {

                totalDigits++;
                num /= 10;

            }
        }

        int[] result = new int[totalDigits];
        int index = 0;

        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];
            
            int digitCount = 0;
            int temp = num;

            while (temp > 0) {

                digitCount++;
                temp /= 10;

            }

            int power = (int) Math.pow(10, digitCount - 1);

            while (power > 0) {

                result[index++] = num / power;
                num %= power; 
                power /= 10; 
                
            }
        }

        return result;
    }
}