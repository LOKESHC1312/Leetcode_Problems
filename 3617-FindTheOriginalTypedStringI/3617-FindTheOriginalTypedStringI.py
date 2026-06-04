# Last updated: 6/4/2026, 10:18:31 PM
class Solution:
    def possibleStringCount(self, word: str) -> int:
        return 1 + sum(a==b for a,b in itertools.pairwise(word))
        