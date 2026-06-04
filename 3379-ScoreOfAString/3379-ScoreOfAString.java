// Last updated: 6/4/2026, 10:19:11 PM
class Solution {
    public int scoreOfString(String s) {
        int a=0;
        for(int i=1;i<s.length();++i)
        a+=Math.abs(s.charAt(i)-s.charAt(i-1));
        return a;
        
    }
}