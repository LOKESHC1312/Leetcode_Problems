# Last updated: 7/11/2026, 11:22:08 AM
1class Solution:
2    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
3        s=set(nums)
4        ans=[]
5        for i in range(1,len(nums)+1):
6            if i not in s:
7                ans.append(i)
8        return ans
9