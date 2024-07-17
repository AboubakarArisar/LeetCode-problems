import java.util.*;
class Solution {
    public int lengthOfLastWord(String s) {
        Stack<String> st = new Stack<>();
        String word = "";
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                if(!(word == "")){
                st.push(word);
                word = "";}
            }
            else{
                word+=s.charAt(i);
            }
            if(i == s.length()-1 && (!(word == "")))st.push(word);
        }
        String lastword = st.pop();
        int len = lastword.length();
        return len;
    }
}
