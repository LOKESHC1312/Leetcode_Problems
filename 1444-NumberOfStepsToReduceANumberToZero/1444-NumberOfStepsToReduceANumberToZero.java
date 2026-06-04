// Last updated: 6/4/2026, 10:28:37 PM
class Solution {
    public int numberOfSteps(int num) {
         int n=0;
        while(num>0)
        {
            if(num%2==0)
            {
                num=num/2;
                n++;
            }
            else
            {
                num=num-1;
                n++;
            }
        }
        return n;
    }
}