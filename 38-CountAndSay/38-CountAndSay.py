# Last updated: 6/6/2026, 10:40:46 PM
class Solution:
    def countAndSay(self,n: int)-> str:
        def runLengthEncoder(s:str)->str:
            i=0
            code=""
            while i<len(s):
                count=1
                while i+1<len(s)and s[i]==s[i+1]:
                    count+=1
                    i+=1
                code+=str(count)+s[i]
                i+=1
            return code
        encoded="1"
        for i in range(n-1):
            encoded=runLengthEncoder(encoded)
        return encoded