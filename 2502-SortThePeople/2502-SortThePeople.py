# Last updated: 6/4/2026, 10:20:12 PM
class Solution:
    def sortPeople(self, names: List[str], heights: List[int]) -> List[str]:
        return [n for _, n in sorted(zip(heights, names), reverse=True)]