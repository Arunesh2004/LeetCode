class Solution {
    public double findMedianSortedArrays(int[] arr1, int[] arr2) {

        ArrayList<Integer> arr3 = new ArrayList<>();

        int i = 0;
        int j = 0;

        int n1 = arr1.length;
        int n2 = arr2.length;

        while(i < n1 && j < n2){

            if(arr1[i] < arr2[j]){

                arr3.add(arr1[i]);
                i++;

            }
            else{

                arr3.add(arr2[j]);
                j++;

            }
        }

        while(i < n1){

            arr3.add(arr1[i]);
            i++;

        }
        while(j < n2){

            arr3.add(arr2[j]);
            j++;

        }

        int n = n1 + n2;

        if(n % 2 == 1){

            return arr3.get(n/2)*1.0;

        }
        else{

            return (arr3.get(n/2) + arr3.get(n/2 - 1)*1.0)/2.0;

        }
        
    }
}