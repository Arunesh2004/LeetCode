class Solution {
    public long minimumPerimeter(long neededApples) {
        
        long count = 0;
        long sumA = 0;

        while(sumA < neededApples){

            count++;
            // sumA = sumA + (12*count*count);
            sumA = 2 * count * ( count + 1 ) * ( 2 * count + 1 );
            
        }

        return 8*count;
    }
}