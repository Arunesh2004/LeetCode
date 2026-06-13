class Solution {
    public boolean isValid(String s) {

        Stack<Character> st = new Stack<>();

        for(char ch : s.toCharArray()) {

            if(ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            }
            else {

                if(st.isEmpty()) {
                    return false;
                }

                char top = st.pop();

                if(ch == ')' && top != '(') {
                    return false;
                }

                if(ch == '}' && top != '{') {
                    return false;
                }

                if(ch == ']' && top != '[') {
                    return false;
                }
            }
        }

        return st.isEmpty();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna