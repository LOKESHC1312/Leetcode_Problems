# Last updated: 6/4/2026, 10:21:46 PM
class Solution:
    def twoOutOfThree(self, nums1: List[int], nums2: List[int], nums3: List[int]) -> List[int]:
        c={}
        for s in (set(nums1),set(nums2),set(nums3)):
            for x in s:
                c[x]=c.get(x, 0)+1
        return [x for x in c if c[x]>=2]        