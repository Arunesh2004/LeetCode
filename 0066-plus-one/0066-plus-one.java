class Solution {
    public int[] plusOne(int[] d) {
        
        for(int i = d.length - 1 ; i >=0 ; i--){

            d[i] = d[i] + 1;

            if(d[i] < 10){

                return d;

            }

            d[i] = 0;

        }

        int[] newNumber = new int[d.length + 1];
        newNumber[0] = 1;

        return newNumber;
    }
}