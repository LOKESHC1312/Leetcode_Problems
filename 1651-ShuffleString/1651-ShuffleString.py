# Last updated: 6/4/2026, 10:22:32 PM
class Solution:
    def restoreString(self, s: str, indices: List[int]) -> str:
        a=""
        indices=list(indices)
        for i in range(len(s)):
            b=indices.index(i)
            a+=s[b]
        return a