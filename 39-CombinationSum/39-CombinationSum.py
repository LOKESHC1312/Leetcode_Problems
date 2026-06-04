# Last updated: 6/4/2026, 10:48:29 PM
1class Solution:
2    def combinationSum(self, candidates: List[int], target: int) -> List[List[int]]:
3        self.ans=[]
4        def traverse(candid, arr,sm):
5            if sm==target:self.ans.append(arr)
6            if sm>=target:return
7            for i in range(len(candid)):
8                traverse(candid[i:],arr+[candid[i]],sm+candid[i])
9        traverse(candidates,[],0)
10        return self.ans