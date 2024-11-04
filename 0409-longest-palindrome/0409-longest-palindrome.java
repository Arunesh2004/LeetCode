class Solution {
    public int longestPalindrome(String s) {
        
        int[] arr = new int[128];

        for(char ch : s.toCharArray()){

            arr[ch]++;

        }

        int result = 0;

        for(int i = 0 ; i < 128 ; i++){

            int value = arr[i];

            result = result + (value/2)*2;

            if(result % 2 == 0 && value % 2 == 1){

                result++;

            }
        }

        return result;

    }
}