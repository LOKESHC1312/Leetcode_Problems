// Last updated: 6/4/2026, 10:21:56 PM
class Solution {
    public int[] buildArray(int[] nums) {
        final int n=nums.length;
        for(int i=0;i<n;++i)
        nums[i]+=n*(nums[nums[i]]%n);
        for(int i=0;i<n;++i)
        nums[i]/=n;
        return nums;
        
    }
}