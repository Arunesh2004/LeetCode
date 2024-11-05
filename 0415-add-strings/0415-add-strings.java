class Solution {
    public String addStrings(String n1, String n2) {
        
        int p1 = n1.length() - 1;
        int p2 = n2.length() - 1;

        int c = 0;
        int base = 10;

        StringBuilder res = new StringBuilder();

        while(p1 >= 0 || p2 >= 0){

            int s = 0;
            int s1 = 0;
            int s2 = 0;

            if(p1 >= 0){

                s1 = n1.charAt(p1--) - 48;

            }

            if(p2 >= 0){

                s2 = n2.charAt(p2--) - 48;
                
            }

            s = s + s1 + s2 + c;

            if(s >= base){

                c = 1;
                s = s - base;

            }
            else{

                c = 0;

            }

            res.append(s);

        }

        if(c == 1){

            res.append(c);

        }

        return res.reverse().toString();

    }
}