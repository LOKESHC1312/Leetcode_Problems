// Last updated: 6/4/2026, 10:21:49 PM
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int ans=0;
        for(final String op:operations)
        ans+=op.charAt(1)=='+'?1:-1;
        return ans;
        
    }
}