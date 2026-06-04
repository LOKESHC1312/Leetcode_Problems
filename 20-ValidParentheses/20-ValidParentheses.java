// Last updated: 6/4/2026, 10:30:36 PM
class Solution {
    public boolean isValid(String s) {
        int length;
        do{
            length=s.length();
            s=s.replace("()","").replace("[]","").replace("{}","");
        } while(length!=s.length());
        return s.length()==0;
        
    }
}