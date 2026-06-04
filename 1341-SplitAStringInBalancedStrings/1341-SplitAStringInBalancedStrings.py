# Last updated: 6/4/2026, 10:28:45 PM
class Solution:
    def balancedStringSplit(self, s: str) -> int:
        balance =0
        output =0
        for i in s:
            balance +=1 if i=='R' else -1
            if balance ==0:
                output+=1
        return output