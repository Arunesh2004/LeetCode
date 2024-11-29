class Solution {
    public int myAtoi(String s) {

        if (s == null || s.length() == 0) {

            return 0; 

        }
        
        char[] arr = s.toCharArray();

        int n = arr.length;
        int sign = 1;

        int i = 0;


        // Handling spaces
        while (i < n) {

            if (arr[i] == ' ') {

                i++;

            } else {

                break;

            }
        }

        // Handling sign
        if(arr[i] == '-' || arr[i] == '+'){

            if(arr[i] == '-'){

                sign = -1;

            }
            else{

                sign = +1;

            }

            i++;

        }

        int result = 0;

        while(i < n){

            char currentCharacter = arr[i];

            if (currentCharacter >= '0' && currentCharacter <= '9') {

                int digit = currentCharacter - '0';

                
                if (result > (Integer.MAX_VALUE - digit) / 10) {

                    if (sign == 1) {

                        return Integer.MAX_VALUE;

                    } else {

                        return Integer.MIN_VALUE;
                    }
                }

                result = result * 10 + digit;

            } else {

                break;

            }

            i++;
            
        }

        return result * sign;

    }
}