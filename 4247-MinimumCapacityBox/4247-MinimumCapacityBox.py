# Last updated: 6/4/2026, 10:17:42 PM
class Solution:
    def minimumIndex(self, c: list[int], it: int) -> int:
        y=[]
        a=-1
        for i in c:
            y.append(i)
        c.sort()
        for i in c:    
            if(i>=it):
                a=i
                break
        if(a>0):
            return(y.index(a))
        return a        