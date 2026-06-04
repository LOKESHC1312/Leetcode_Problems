# Last updated: 6/4/2026, 10:30:21 PM
class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        return list(itertools.permutations(nums))