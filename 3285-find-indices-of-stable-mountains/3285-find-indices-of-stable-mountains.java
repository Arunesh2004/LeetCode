class Solution {
    public List<Integer> stableMountains(int[] h, int t) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=1;i<h.length;i++){
            if(h[i-1]>t){
                arr.add(i);
            }
        }
        return arr;
    }
}