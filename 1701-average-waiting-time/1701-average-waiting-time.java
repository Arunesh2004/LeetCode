class Solution {
    public double averageWaitingTime(int[][] customers) {
        
        double FreeTime = 0;
        double waiting = 0;

        for(int[] customer: customers){

            int ArrivalTime = customer[0];
            int TimeTakenToCook = customer[1];

            if(ArrivalTime < FreeTime){

                FreeTime = TimeTakenToCook + FreeTime;

            }

            else{

                FreeTime = ArrivalTime + TimeTakenToCook;

            }

            waiting = waiting + FreeTime - ArrivalTime;

        }

        return waiting/customers.length;

    }
}