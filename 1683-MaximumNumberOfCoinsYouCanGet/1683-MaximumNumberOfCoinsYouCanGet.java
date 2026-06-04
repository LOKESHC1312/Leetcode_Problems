// Last updated: 6/4/2026, 10:22:26 PM
class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int res=0;
        for(int i=piles.length/3;i<piles.length;i+=2){
            res+=piles[i];
        }
        return res;
    }
}