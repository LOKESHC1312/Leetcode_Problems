// Last updated: 6/4/2026, 10:29:40 PM
import java.util.Arrays;
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false; 
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Arrays.sort(sChars);  
        Arrays.sort(tChars);
        return Arrays.equals(sChars, tChars);
    }
}