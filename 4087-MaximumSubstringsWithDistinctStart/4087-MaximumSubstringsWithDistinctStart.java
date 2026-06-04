// Last updated: 6/4/2026, 10:18:02 PM
class Solution {
    public int maxDistinct(String s) {
        HashSet<Character> set=new HashSet<Character>();
        for(char ch:s.toCharArray()) set.add(ch);
        return set.size();
        
    }
}