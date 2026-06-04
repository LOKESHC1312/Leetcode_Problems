// Last updated: 6/4/2026, 10:30:40 PM
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String v="";
        for(int i=0;i<strs[0].length();i++){
            for(int j=1;j<strs.length;j++){
                if(i>=strs[j].length()||strs[j].charAt(i)!=strs[0].charAt(i)){
                    return v;
                }
            }
            v=v+strs[0].charAt(i);
        }
        return v;

        
    }
}