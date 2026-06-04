// Last updated: 6/4/2026, 10:29:35 PM
class Solution {
    public int addDigits(int num) {
        if(num==0){
            return 0;
        }
        if(num%9==0){
            return 9;
        }
        return num%9;
        
    }
}