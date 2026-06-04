# Last updated: 6/4/2026, 10:17:51 PM
class Solution:
    def findMissingElements(self, nums: List[int]) -> List[int]:
        a=min(nums)
        b=max(nums)
        c=[]
        for i in range(a,b+1):
            if i not in nums:
                c.append(i)
        return c    