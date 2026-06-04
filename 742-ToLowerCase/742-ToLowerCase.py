# Last updated: 6/4/2026, 10:29:08 PM
class Solution:
    def toLowerCase(self, s: str) -> str:
        ans=""
        for ch in s:
            if 'A'<=ch<='Z':
                ans+=chr(ord(ch)+32)
            else:
                ans+=ch
        return ans    