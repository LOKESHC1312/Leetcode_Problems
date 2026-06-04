# Last updated: 6/4/2026, 10:30:20 PM
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        a=defaultdict(list)
        for s in strs:
            b=''.join(sorted(s))
            a[b].append(s)
        return list(a.values())