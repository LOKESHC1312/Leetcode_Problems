# Last updated: 6/4/2026, 10:17:59 PM
class Solution:
    def totalWaviness(self, num1: int, num2: int) -> int:
        return sum(
            c[i-1]<c[i]> c[i+1] or c[i-1]>c[i]<c[i+1]
            for num in range(num1, num2+1)
            for c in [list(str(num))]
            for i in range(1,len(c)-1)
        )