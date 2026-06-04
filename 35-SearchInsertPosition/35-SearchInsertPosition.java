// Last updated: 6/4/2026, 10:30:24 PM
class Solution {
    public int searchInsert(int[] nums, int target) {
        int length=nums.length;
        for(int i=0;i<length;i++){
            if(nums[i]>=target){
                return i;
            }
        }
        return length;
        
    }
}