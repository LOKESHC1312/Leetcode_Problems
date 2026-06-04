# Last updated: 6/4/2026, 10:28:56 PM
class Solution:
    def removeOuterParentheses(self, s: str) -> str:
        res=[]
        depth=0
        for c in s:
            if c=='(':
                if depth>0:
                    res.append(c)
                depth+=1
            else:
                depth-=1
                if depth>0:
                    res.append(c)
        return "".join(res)                    