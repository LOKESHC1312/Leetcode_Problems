// Last updated: 6/4/2026, 10:19:07 PM
class Solution {
  public int[][] divideArray(int[] nums, int k) {
    int[][] ans = new int[nums.length / 3][3];

    Arrays.sort(nums);

    for (int i = 2; i < nums.length; i += 3) {
      if (nums[i] - nums[i - 2] > k)
        return new int[0][];
      ans[i / 3] = new int[] {nums[i - 2], nums[i - 1], nums[i]};
    }

    return ans;
  }
}