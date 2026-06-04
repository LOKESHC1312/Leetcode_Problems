// Last updated: 6/4/2026, 10:30:10 PM
class Solution{
    public int[] plusOne(int[] digits){
        int carry=1;
        for(int i=digits.length-1;i>=0;i--){
            int val=carry+digits[i];
            carry=val/10;
            digits[i]=val%10;
            if(carry==0)return digits;
        }
        int []arr=new int[digits.length+1];
        arr[0]=1;
        return arr;
    }
}