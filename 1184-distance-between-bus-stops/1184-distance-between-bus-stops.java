class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {

        if (start > destination) {

            int temp = start;
            start = destination;
            destination = temp;

        }

        int clockwiseDistance = 0;
        int totalDistance = 0;

        for (int i = 0; i < distance.length; i++) {

            totalDistance += distance[i];

            if (i >= start && i < destination) {

                clockwiseDistance += distance[i];

            }
        }

        int counterClockwiseDistance = totalDistance - clockwiseDistance;

        return Math.min(clockwiseDistance, counterClockwiseDistance);
        
    }
}
