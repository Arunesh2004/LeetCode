class Solution {
    public int[] sortArray(int[] nums) {
        
    //     int i = 0;

    //     while(i < nums.length){

    //         if (nums[i] < 1 || nums[i] > nums.length) {

    //             i++;

    //             continue;

    //         }

    //         int correct = nums[i] - 1;

    //         if(nums[i] != correct){

    //             swap(nums, i, correct);

    //         }
    //         else{

    //             i++;

    //         }
    //     }

    //     return nums;

    // }

    // void swap(int[] arr, int first, int second) {

    //     int temp = arr[first];

    //     arr[first] = arr[second];

    //     arr[second] = temp;
    // }

        for(int i = 1 ; i < nums.length ; i++){

            for(int j = i ; j > 0 ; j--){

                if(nums[j] < nums[j - 1]){

                    swap(nums, j, j-1);

                }
                else{

                    break;

                }
            }
        }

        return nums;

    }

    void swap(int[] arr, int first, int second) {

        int temp = arr[first];

        arr[first] = arr[second];

        arr[second] = temp;
    }
}