// Last updated: 6/4/2026, 10:22:34 PM
class Solution {
    public int numWaterBottles(int n1, int n2) {
    //     int sum=n;
    //     while(n/target!=0){
    //         sum+=n/target;
    //         n=n/target+n%target;
    //     }
    //     return sum;
    
    return n1+(n1-1)/(n2-1);
}
}