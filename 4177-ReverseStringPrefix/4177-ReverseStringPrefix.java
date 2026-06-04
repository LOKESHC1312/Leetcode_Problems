// Last updated: 6/4/2026, 10:17:54 PM
class Solution {
    public String reversePrefix(String s, int k) {
        StringBuilder sb=new StringBuilder();
        sb.append(s.substring(0,k));
        sb.reverse();
        sb.append(s.substring(k,s.length()));
        return sb.toString();
    }
}