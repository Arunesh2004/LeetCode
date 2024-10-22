class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {

        int a = 0;
        int b = 0;

        for(int i = 0 ; i < A.length ; i++){

            a = a + A[i];

        }

        for(int i = 0 ; i < B.length ; i++){

            b = b + B[i];

        }

        int diff = (a - b)/2;

        int[] ans = new int[2];

        for(int i = 0 ; i < A.length ; i++){

            for(int j = 0 ; j < B.length ; j++){

                if(A[i] - B[j] == diff){

                    ans[0] = A[i];
                    ans[1] = B[j];

                }
            }
        }

        return ans;
        
    }
}