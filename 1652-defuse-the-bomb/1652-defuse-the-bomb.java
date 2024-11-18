class Solution {
    public int[] decrypt(int[] code, int k) {

        int[] res = new int[code.length];

        if(k == 0){

            return res;

        }
        
        for(int i = 0 ; i < code.length ; i++){

            int sum = 0;

            if(k > 0){

                for(int j = 1 ; j <= k ; j++){

                    sum = sum + code[(j + i) % code.length];

                }
            }
            else if(k < 0){

                for(int j = 1 ; j <= -k ; j++){

                    sum = sum + code[(i - j + code.length) % code.length];

                }
            }

            res[i] = sum;

        }

        return res;
    }
}