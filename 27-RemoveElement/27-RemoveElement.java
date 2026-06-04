// Last updated: 6/4/2026, 10:30:30 PM
class Solution {
  public int removeElement(int[] nums, int val) {
    int i = 0;

    for (final int num : nums)
      if (num != val)
        nums[i++] = num;

    return i;
  }
}