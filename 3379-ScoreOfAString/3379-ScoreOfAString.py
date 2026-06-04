# Last updated: 6/4/2026, 10:19:01 PM
class Solution:
    def scoreOfString(self, s: str) -> int:
        score =0
        for i in range(1,len(s)):
         score =score + abs(ord(s[i])-ord(s[i-1]))
        return score