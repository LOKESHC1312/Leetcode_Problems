// Last updated: 6/4/2026, 10:22:37 PM
class Solution {
    public int numIdenticalPairs(int[] A) {
        int ans=0,cnt[]=new int[101];
        for(int a: A){
            ans+=cnt[a]++;
        }
        return ans;
    }
}