class Solution {
    public int[] nextGreaterElement(int[] num1, int[] num2) {
        
        int[] res = new int[num1.length];

        for(int i = 0 ; i < num1.length ; i++){

            int c = num1[i];
            int iN2 = -1;

            for(int j = 0 ; j < num2.length ; j++){

                if(num2[j] == c){

                    iN2 = j;
                    break;

                }
            }

            int nGI = -1;

            for(int j = iN2 + 1 ; j < num2.length ; j++){

                if(num2[j] > c){

                    nGI = num2[j];
                    break;

                }
            }

            res[i] = nGI;

        }

        return res;

    }
}