# Last updated: 6/4/2026, 10:22:29 PM
class Solution:
    def diagonalSum(self, mat: List[List[int]]) -> int:
        s=0;l=len(mat)
        for i in range(l):
            s+=mat[i][i]+mat[i][l-1-i]
        return s if l%2==0 else s-mat[l//2][l//2]    