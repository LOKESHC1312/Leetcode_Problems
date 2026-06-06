# Last updated: 6/6/2026, 10:38:09 PM
class Solution:
    def leftRightDifference(self, nums: List[int]) -> List[int]:
        ans=[]
        t=sum(nums)
        temp1=0
        for i in range(len(nums)):
            if i-1<0:
                temp=t-nums[i]
                ans.append(temp)
            else:
                temp1+=nums[i-1]
                ans.append(abs(temp-nums[i]-temp1))
                temp=temp-nums[i]
        return ans