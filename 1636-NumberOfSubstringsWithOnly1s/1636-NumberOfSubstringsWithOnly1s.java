// Last updated: 6/4/2026, 10:22:36 PM
class Solution {
    public int numSub(String s) {
    int n=s.length();
    int count=0;
    int mod=1000000007;
    int i=0,j=0;
        while(j<n){
            if(s.charAt(i)=='0'){
                j++;
                i=j;
            }
            else{
                if(s.charAt(i)==s.charAt(j)){
                    count=(count+(j-i+1))%mod;
                    j++;
                }
                else{
                    i=j;
                }
            }
        }
        return count;
    }
}