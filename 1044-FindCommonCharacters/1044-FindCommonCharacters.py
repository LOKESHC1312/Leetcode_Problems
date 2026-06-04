# Last updated: 6/4/2026, 10:28:58 PM
class Solution:
    def commonChars(self, words: List[str]) -> List[str]:
        ans=collections.Counter(words[0])
        for word in words:
            ans&=collections.Counter(word)
        return list(ans.elements())