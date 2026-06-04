# Last updated: 6/4/2026, 10:36:20 PM
1class Solution:
2    def totalWaviness(self, num1: int, num2: int) -> int:
3        return sum(
4            c[i-1]<c[i]> c[i+1] or c[i-1]>c[i]<c[i+1]
5            for num in range(num1, num2+1)
6            for c in [list(str(num))]
7            for i in range(1,len(c)-1)
8        )