// Last updated: 6/4/2026, 10:18:12 PM
class Solution {
    public int reverseDegree(String s) {
        int degree=0;
        for(int i=0;i<s.length();i++){
            int indx='z'-s.charAt(i)+1;
            degree += (i+1)*indx;
        }
        return degree;
    }
}