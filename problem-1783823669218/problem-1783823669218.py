# Last updated: 7/12/2026, 8:04:29 AM
1class Solution:
2    def secondsBetweenTimes(self, startTime: str, endTime: str) -> int:
3        def toSeconds(t):
4            h,m,s=map(int,t.split(":"))
5            return h*3600+m*60+s
6        return toSeconds(endTime)-toSeconds(startTime)