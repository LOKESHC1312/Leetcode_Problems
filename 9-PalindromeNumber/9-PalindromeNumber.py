# Last updated: 6/4/2026, 10:30:45 PM
class Solution:
    def isPalindrome(self, x: int) -> bool:
        a=str(x)
        return a==a[::-1]