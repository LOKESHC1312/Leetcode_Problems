// Last updated: 6/4/2026, 10:20:06 PM
class Solution {
    public int commonFactors(int a, int b) {
        int c=0;
        for(int i=1; i<=a && i<=b; i++){
            if(a%i==0 && b%i==0) c++;
        }
        return c;
        }
}