// Last updated: 6/4/2026, 10:28:42 PM
class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int prd=1;
        int sub=0;
     while(n>0)
     {
        int digit=n%10;
        sum+=digit;
        prd*=digit;
        n/=10;
       
     }
     return  sub=prd-sum;
        
    }
}