// Last updated: 6/4/2026, 10:30:12 PM
class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int c=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)!=' ')
            c++;
            else
            break;
        }
        return c;
    }
}