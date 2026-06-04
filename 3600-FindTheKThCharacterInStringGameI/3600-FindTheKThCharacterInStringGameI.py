# Last updated: 6/4/2026, 10:18:37 PM
class Solution:
    def kthCharacter(self, k: int) -> str:
        return string.ascii_lowercase[(k - 1).bit_count()]