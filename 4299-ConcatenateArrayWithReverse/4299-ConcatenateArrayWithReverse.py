# Last updated: 6/4/2026, 10:17:40 PM
class Solution:
    def concatWithReverse(self, nums: list[int]) -> list[int]:
            return nums + nums[::-1]