# Last updated: 6/4/2026, 10:29:13 PM
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        return sum(nums[::2])