class Solution {
    public boolean isMonotonic(int[] arr) {

        boolean increasing = true;
        boolean decreasing = true;

        for(int i = 1 ; i < arr.length ; i++){

            if(arr[i] > arr[i - 1]){

                increasing = false;

            }

            if(arr[i] < arr[i - 1]){

                decreasing = false;

            }
        }

        return increasing || decreasing ;
    }
}


// OPTIMIZATION NEEDED --> SOME TEST CASES FAILED :-

// int max = arr[0];
//         int min = arr[0];

//         boolean ans = false;

//         for(int i = 1 ; i < arr.length ; i++){

//             if(arr[i] > arr[i - 1]){

//                 max = arr[i];

//             }
//             if(arr[i] < arr[i - 1]){

//                 min = arr[i];

//             }

//         }

//         if(arr.length == 1){

//             ans = true;

//         }

//         for(int i = 1 ; i < arr.length ; i++){

//             if((arr[0] == min && arr[arr.length - 1] == max) ||  (arr[0] == max && arr[arr.length - 1] == min)){

//                 if((arr[i] >= arr[i - 1]) || (arr[arr.length - 1] >= arr[arr.length - 2])){

//                     ans = true;

//                 } 
//                 if((arr[i] <= arr[i - 1]) || arr[arr.length - 1] <= arr[arr.length - 2]){

//                     ans = true;

//                 }
//             }
//         }

//         return ans;

//     }