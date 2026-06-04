# Last updated: 6/4/2026, 10:17:48 PM
class Solution:
    def reversePrefix(self, s: str, k: int) -> str:
        return s[:k][::-1]+s[k:]