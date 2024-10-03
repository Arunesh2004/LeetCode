class Solution {
    public int search(int[] nums, int target) {

        int pivot = FindPivot(nums);

        // if you did not find pivot, it means the array is not rotated
        if(pivot == -1){

            //just do normal bs
            return BS(nums, target, 0, nums.length-1);

        }

        //if pivot is found, you have found 2 ascending sorted arrays
        if(nums[pivot] == target){

            return pivot;

        }
        if(target >= nums[0]){ //then search space is reduced to (start till pivot-1)

            return BS(nums, target, 0, pivot-1);

        }

        return BS(nums, target, pivot+1, nums.length-1);
        
    }

    static int BS(int[] arr, int target, int start, int end){

        while(start <= end){

            int mid = start + (end-start)/2;

            if(target < arr[mid]){

                end = mid - 1;

            }
            else if(target > arr[mid]){

                start = mid + 1;

            }
            else{

                return mid;

            }
        }

        return -1;

    }

    static int FindPivot(int[] arr){

        int start = 0;
        int end = arr.length - 1;

        while(start < end){

            int mid = start + (end - start)/2;

            if(mid < end && arr[mid] > arr[mid+1]){

                return mid;

            }

            if(mid > start && arr[mid-1] > arr[mid]){

                return mid - 1;

            }

            if(arr[mid] <= arr[start]){

                end = mid - 1;

            }

            else{

                start = mid + 1;

            }
        }

        return -1;
    }

}