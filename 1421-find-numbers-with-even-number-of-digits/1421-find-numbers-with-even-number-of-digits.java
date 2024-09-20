class Solution {
    public int findNumbers(int[] arr) {

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            
            int c = 0; // internall counting of numbers arr[i]

           while(arr[i]!=0){

               arr[i] = arr[i]/10;
               c++;
           }

           if(c%2 == 0){
               count++;
           }

        }
        
        return count;
    }
}