class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        
        boolean[] filled = new boolean[baskets.length];

        int nFilled = 0;

        for(int Fr : fruits){

            boolean Done = false;

            for(int j = 0 ; j < baskets.length ; j++){

                if(!filled[j] && baskets[j] >= Fr){

                    filled[j] = true;
                    Done = true;
                    break;

                }
            }

            if(!Done){

                nFilled++;

            }
        }

        return nFilled;

    }
}