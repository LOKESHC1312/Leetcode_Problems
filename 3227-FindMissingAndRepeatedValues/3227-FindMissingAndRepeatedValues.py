# Last updated: 6/4/2026, 10:19:09 PM
class Solution:
    def findMissingAndRepeatedValues(self, grid: List[List[int]]) -> List[int]:
        ans =[]
        for i in grid:
            ans.extend(i)
        res=[]
        res.append(mode(ans))
        a=1
        while a<=max(ans)+1:
            if a not in ans:
                res.append(a)
                break
            a+=1
        return res        