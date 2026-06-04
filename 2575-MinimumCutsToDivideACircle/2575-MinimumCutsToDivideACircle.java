// Last updated: 6/4/2026, 10:20:02 PM
class Solution {
    public int numberOfCuts(int n) {
        if(n==1)
        return 0;

        if(n%2==0)
        return n/2;

        return n;
         }
}