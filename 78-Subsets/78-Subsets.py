# Last updated: 6/4/2026, 10:30:05 PM
class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        ans=[[]]
        for j in nums:
            ans+=[i+[j] for i in ans]
        return ans    