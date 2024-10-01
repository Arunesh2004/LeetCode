class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        
        int start = 0;
        int end = letters.length - 1;

        while(start <= end){

            int mid = start + (end - start)/2;

            if(target < letters[mid]){

                end = mid - 1;

            }

            else{  // target > letters[mid]  and we don't need == condition check since the question wants only greater one .... 

                start = mid + 1;

            }
        }

        return letters[start % letters.length]; // for wrap around condition i.e. ensures that even if you go beyond the last letter, you'll loop back to the beginning ...
    }
}