// Last updated: 6/4/2026, 10:29:16 PM
class Solution {
    public int hammingDistance(int x, int y) {
        int ham=x^y;
        return Integer.bitCount(ham);
    }
}