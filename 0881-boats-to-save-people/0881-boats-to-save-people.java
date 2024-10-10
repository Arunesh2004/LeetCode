class Solution {
    public int numRescueBoats(int[] p, int l) {

        int count = 0;
        Arrays.sort(p);

        int LightestPerson = 0;
        int HeaviestPerson = p.length - 1;
        

        while(LightestPerson <= HeaviestPerson){

            if((p[HeaviestPerson] + p[LightestPerson]) <= l){

                LightestPerson++;
                

            }

            HeaviestPerson--;

            count++;
        }

        return count;
        
    }
}