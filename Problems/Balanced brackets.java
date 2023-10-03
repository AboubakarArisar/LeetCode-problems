class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        for(int i = 0; i < s.length(); i++) {
            char input = s.charAt(i);
            if(input == '(' || input == '{' || input == '[') {
                st.push(input);
            }
            else {
                if(st.empty()) {
                    return false;
                }
                char top = st.pop();
                if((top == '(' && input != ')') || (top == '{' && input !='}') || (top == '[' && input !=']')){
                    return false;
                }
                
            }
        }
        return st.empty();
    }
}
