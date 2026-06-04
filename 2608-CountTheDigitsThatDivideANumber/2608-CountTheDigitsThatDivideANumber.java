// Last updated: 6/4/2026, 10:19:59 PM
class Solution {
    public int countDigits(int num) {
        int count=0;
        int temp=num;
        while(temp>0){
            int digit=temp%10;
            if(digit!=0&&num%digit==0){
                count ++;
            }
            temp/=10;
        }
        return count;
    }
}