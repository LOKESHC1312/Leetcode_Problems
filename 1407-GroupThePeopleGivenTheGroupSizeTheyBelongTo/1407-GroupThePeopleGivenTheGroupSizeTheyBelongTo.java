// Last updated: 6/4/2026, 10:28:41 PM
class Solution {
    public List<List<Integer>> groupThePeople(int[] arr) {
        List<List<Integer>> result=new ArrayList<>();
        Map<Integer, List<Integer>> map=new HashMap<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            int a=arr[i];
            map.putIfAbsent(a,new ArrayList<>());
            map.get(a).add(i);
            if(map.get(a).size()==a){
                result.add(new ArrayList<>(map.get(a)));
                map.get(a).clear();
            }
        }
        return result;
    }
}