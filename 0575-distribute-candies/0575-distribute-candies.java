class Solution {
    public int distributeCandies(int[] ct) {

        Arrays.sort(ct);

        int count = 1;
        
        for(int i = 1 ; i < ct.length ; i++){

            if(ct[i] != ct[i - 1]){

                count++;

            }
        }

        int maxCandies = ct.length/2;

        return Math.min(count, maxCandies);

    }
}