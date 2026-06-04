// Last updated: 6/4/2026, 10:18:54 PM
class Solution {
    public List<String> validStrings(int n) {
        List<String> ans=new ArrayList<String>();
        int total=(int)Math.pow(2,n);
        for(int i=0;i<total;i++){
            String binary=String.format("%"+n+"s",Integer.toBinaryString(i)).replace(' ','0');
            if(!binary.contains("00")){
                ans.add(binary);
            }
        }
        return ans;
    }
}