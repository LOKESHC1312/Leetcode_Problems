// Last updated: 6/4/2026, 10:18:47 PM
class Solution {
    public String stringHash(String s, int k) {
        int len=s.length();
        int it=(int)len/k;
        char c[]=s.toCharArray();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<it;i++){
            int cal=0;
            for(int j=k*i;j<k*i+k;j++){
                cal+=c[j]-'a';
            }
            char ch=(char)('a'+cal%26);
            sb.append(ch);
        }
        return sb.toString();
    }
}