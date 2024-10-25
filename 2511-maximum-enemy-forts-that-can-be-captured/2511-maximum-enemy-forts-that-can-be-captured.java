class Solution {
    public int captureForts(int[] forts) {
        
        int result = 0;

        for(int i = 0 , j = 0 ; i < forts.length ; i++){

            if(forts[i] != 0){

                if(forts[j] == -forts[i]){

                    int distance = i - j - 1;

                    if(distance > result){

                        result = distance;

                    }
                }

                j = i;

            }
        }

        return result;
    }
}