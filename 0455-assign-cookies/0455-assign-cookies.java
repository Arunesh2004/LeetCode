class Solution {
    public int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);
        
        int count = 0;
        int j = 0;

        for(int i = 0 ; i < g.length && j < s.length ; j++){

            if(s[j] >= g[i]){

                count++;
                i++;

            }
            
        }

        return count;

    }
}