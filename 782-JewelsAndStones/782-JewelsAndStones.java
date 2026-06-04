// Last updated: 6/4/2026, 10:29:06 PM
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        for(char j:jewels.toCharArray()){
            for(char s:stones.toCharArray()){
                if(j==s){
                    count++;
                }
            }
        }
        return count;
        
    }
}