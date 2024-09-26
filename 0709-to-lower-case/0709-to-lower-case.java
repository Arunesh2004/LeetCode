class Solution {
    public String toLowerCase(String s) {

        StringBuilder res = new StringBuilder();

        for(char ch : s.toCharArray()){

            if(ch >= 'A' && ch <= 'Z'){

                res.append((char)(ch+32));

            }

            else{

                res.append(ch);

            }
        }

        return res.toString();

        
    }
}