// Last updated: 6/4/2026, 10:18:04 PM
class Solution {
    char[] arr={'a','i','e','o','u'};
    public int maxFreqSum(String s) {
        int n=s.length();
        int[] count=new int[26];
        int maxV=0;
        int maxC=0;
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(isVowel(c)){
                maxV=Math.max(maxV,++count[c-'a']);
            }else{
                maxC=Math.max(maxC,++count[c-'a']);
            }
        }

        return maxC+maxV;
    }
    boolean isVowel(char c){
        for(char s:arr){
            if(c==s) return true;
        }
        return false;
    }
}