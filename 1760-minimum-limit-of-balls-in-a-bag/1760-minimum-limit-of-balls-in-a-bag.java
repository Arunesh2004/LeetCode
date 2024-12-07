class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        
       int l = 1;

       int r = Integer.MIN_VALUE;
       for(int num : nums){

            r = Math.max(r, num);

       }

       int ans = r;

       while(l <= r){

        int penalty = (l + r)/2;

        int operations = 0;

        for(int num : nums){

            if(num > penalty){

                operations += (num - 1)/penalty;

            }
        }

        if(operations <= maxOperations){

            ans = penalty;
            r = penalty - 1;

        }
        else{

            l = penalty + 1;

        }
       }

       return ans;

    }
}