// Last updated: 6/4/2026, 10:18:42 PM
class Solution {
    public String convertDateToBinary(String date) {
        String res="";
        for(String str:date.split("-")){
            res+="-";
            int value=Integer.parseInt(str);
            res+=Integer.toBinaryString(value);
        }
        return res.substring(1);
    }
}