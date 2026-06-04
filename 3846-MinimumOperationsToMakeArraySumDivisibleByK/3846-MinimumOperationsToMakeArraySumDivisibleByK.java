// Last updated: 6/4/2026, 10:18:07 PM
class Solution {
    public int minOperations(int[] nums, int k) {
        int ans=0, n=nums.length;
        for(int i=0;i<n;i++) ans+=nums[i];
        return ans%k;
        
    }
}