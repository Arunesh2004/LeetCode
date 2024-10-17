class Solution {
    public int maximumGap(int[] arr) {

        if (arr == null || arr.length < 2) {
            return 0; 
        }

        int[] gap = new int[arr.length - 1];

        Arrays.sort(arr);

        for(int i = 1 ; i < arr.length ; i++){

            gap[i -1] = arr[i] - arr[i - 1];

        }

        int maxGap = gap[0];

        for(int j = 1 ; j < gap.length ; j++){

            if(gap[j] > maxGap){

                maxGap = gap[j];

            }
        }

        return maxGap;
        
    }
}