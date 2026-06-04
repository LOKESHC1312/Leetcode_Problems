// Last updated: 6/4/2026, 10:21:47 PM
class Solution {
    public int maximumDifference(int[] nums){
        int ans=-1;
        int mn=nums[0];
        for(int i=1;i<nums.length;++i){
            if(nums[i]>mn)
            ans=Math.max(ans,nums[i]-mn);
            mn=Math.min(mn,nums[i]);
        }
        return ans;
    }
}