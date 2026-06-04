// Last updated: 6/4/2026, 10:28:30 PM
class Solution {
    public int[] processQueries(int[] q, int m) {
        List<Integer>lis=new ArrayList<>();
        for(int i=1;i<=m;i++){
            lis.add(i);
        }
        int ans[]=new int[q.length];
        for(int i=0;i<q.length;i++){
            ans[i]=lis.indexOf(q[i]);
            lis.remove(lis.indexOf(q[i]));
            lis.add(0,q[i]);
        }
        return ans;
    }
}