class Solution {
    public String reverseVowels(String s) {
        
        char[] arr = s.toCharArray();

        int first = 0;
        int second = arr.length - 1;

        String vowels = "aeiouAEIOU";

        while(first < second){

            while (first < second && vowels.indexOf(arr[first]) == -1) {
                first++;
            }

            
            while (first < second && vowels.indexOf(arr[second]) == -1) {
                second--;
            }

            
            char temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;

            
            first++;
            second--;
        }

        return new String(arr);

    }
}