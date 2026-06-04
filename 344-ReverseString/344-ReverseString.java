// Last updated: 6/4/2026, 10:29:26 PM
class Solution {
    public void reverseString(char[] s) {
        Stack<Character> st=new Stack<>();
        for(char c: s){
            st.push(c);
        }
        for(int i=0;i<s.length;i++){
            s[i]=st.pop();
        }
        
    }
}