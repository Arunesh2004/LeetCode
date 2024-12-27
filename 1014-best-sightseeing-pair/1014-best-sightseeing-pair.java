class Solution {
    public int maxScoreSightseeingPair(int[] values) {

        // int ans = 0;

        // for(int i = 0 ; i < values.length ; i++){

        //     for(int j = i + 1 ; j < values.length ; j++){

        //         int score = values[i] + values[j] + i - j;

        //         ans = Math.max(ans, score);

        //     }
        // }

        // return ans;


        //OPTIMIZATION :-

        int ans = 0; 

        int mL = values[0]; 

        for (int j = 1; j < values.length; j++) {
            
            ans = Math.max(ans, mL + values[j] - j);

            
            mL = Math.max(mL, values[j] + j);
        }

        return ans;
    }
}