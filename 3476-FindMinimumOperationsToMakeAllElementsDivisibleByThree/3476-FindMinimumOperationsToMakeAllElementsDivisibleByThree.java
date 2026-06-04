// Last updated: 6/4/2026, 10:18:52 PM
class Solution {
    public int minimumOperations(int[] nums) {
        int res=0;
        for(int num:nums){
            if(num%3!=0) res++;
        }
        return res;
        
    }
}