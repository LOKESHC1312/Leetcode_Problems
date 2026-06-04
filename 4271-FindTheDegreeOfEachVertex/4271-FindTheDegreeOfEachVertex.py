# Last updated: 6/4/2026, 10:17:46 PM
class Solution:
    def findDegrees(self,m):
        return [m[i].count(1) for i in range(len(m))]