// Last updated: 6/4/2026, 10:22:21 PM
class Solution {
    public int minPartitions(String n) {
        return n.chars().max().getAsInt()-'0';
    }
}