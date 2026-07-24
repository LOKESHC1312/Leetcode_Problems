# Last updated: 7/24/2026, 11:30:52 AM
1class Solution:
2    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
3        for i in range(0,n):
4            nums1[m+i]=nums2[i]
5        nums1.sort()