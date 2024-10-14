class Solution {
    public int maxArea(int[] h) {
        
        int leftStick = 0;
        int rightStick = h.length - 1;
        int maxArea = 0;

        while(leftStick < rightStick){

            // int area = Math.min(h[leftStick] , h[rightStick]) * (rightStick - leftStick);

            // if(area > maxArea){

            //     maxArea = area;

            // }

            // if(h[leftStick] < h[rightStick]){

            //     leftStick++ ;

            // }

            // else{

            //     rightStick-- ;

            // }

            int smallerHeight = 0;

            if(h[leftStick] < h[rightStick]){

                smallerHeight = h[leftStick];
                leftStick++;

            }
            else{

                smallerHeight = h[rightStick];
                rightStick--;

            }

            int width = rightStick - leftStick + 1;
            int area = smallerHeight * width;

            if (area > maxArea) {
                maxArea = area;
            }


        }

        return maxArea;
    }
}