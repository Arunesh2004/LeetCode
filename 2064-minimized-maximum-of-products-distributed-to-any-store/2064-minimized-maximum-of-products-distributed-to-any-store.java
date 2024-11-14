class Solution {
    public int minimizedMaximum(int n, int[] q) {
        
        int start = 1;
        int end = Integer.MIN_VALUE;

        for(int i = 0 ; i < q.length ; i++){

            if(q[i] > end){

                end = q[i];

            }
        }

        int res = -1;

        while(start <= end){

            int mid = start + (end - start)/2;

            if(isDistributionPossible(q, mid, n)){

                res = mid;
                end = mid - 1;

            }
            else{

                start = mid + 1;

            }
        }

        return res;

    }

    boolean isDistributionPossible(int[] q, int maxPro, int stores){

        int storeCount = 0;

        for(int i = 0 ; i < q.length ; i++){

            storeCount += q[i]/maxPro;

            if(q[i] % maxPro != 0){

                storeCount ++;

            }

            if(storeCount > stores){

                return false;

            }
        }

        return true;

    }
}