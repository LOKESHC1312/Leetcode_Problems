# Last updated: 6/4/2026, 10:22:07 PM
class Solution:
    def truncateSentence(self, s: str, k: int) -> str:
        lis=s.split()
        return " ".join(lis[:k])