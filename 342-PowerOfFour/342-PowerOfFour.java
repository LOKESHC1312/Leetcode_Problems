// Last updated: 6/4/2026, 10:29:28 PM
class Solution {
    public boolean isPowerOfFour(int n) {
    return n > 0 && (n & (n - 1)) == 0 && (n & 0x55555555) != 0;
    }
}