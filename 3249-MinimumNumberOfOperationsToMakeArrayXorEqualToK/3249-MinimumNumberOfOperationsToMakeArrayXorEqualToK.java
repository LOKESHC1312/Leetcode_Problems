// Last updated: 6/4/2026, 10:19:03 PM
class Solution {
    public int minOperations(int[] nums, int k) {
        for(int x:nums){
            k^=x;
        }
        return Integer.bitCount(k);
    }
}