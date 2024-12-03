class Solution {
    public String addSpaces(String s, int[] spaces) {

        char[] arr = s.toCharArray(); 

        StringBuilder str = new StringBuilder();

        int j = 0;

        for(int i = 0 ; i < arr.length ; i++){

            if(j < spaces.length && spaces[j] == i){

                str = str.append(" ");
                j++;
            }

            str = str.append(arr[i]);

        }

        return str.toString();
        
    }
}