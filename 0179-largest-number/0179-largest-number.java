class Solution {
    public String largestNumber(int[] nums) {
        
        String[] Str = new String[nums.length];

        for(int i = 0 ; i < nums.length ; i++){

            Str[i] = String.valueOf(nums[i]);

        }

        Arrays.sort(Str , (a , b) -> compare(a,b));

        if(Str[0].equals("0")){

            return "0";

        }

        StringBuilder result = new StringBuilder();

        for(String num : Str){

            result.append(num);

        }

        return result.toString();
    }

    int compare(String a , String b){

        int i = 0 ; 
        int j = 0 ;

        while(i < a.length() || j < b.length()){

            if(i == a.length()){

                i = 0;

            }
            if(j == b.length()){

                j = 0;

            }
            if(a.charAt(i) < b.charAt(j)){

                return 1;

            }
            if(a.charAt(i) > b.charAt(j)){

                return -1;

            }

            i++;
            j++;

        }

        return 0;

    }
}