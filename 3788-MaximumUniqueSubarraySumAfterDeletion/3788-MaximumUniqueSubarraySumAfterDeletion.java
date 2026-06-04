// Last updated: 6/4/2026, 10:18:16 PM
class Solution {
  public int maxSum(int[] nums) {
    final int mx = Arrays.stream(nums).max().getAsInt();
    if (mx <= 0)
      return mx;
    return Arrays.stream(nums)
        .boxed()
        .collect(Collectors.toSet())
        .stream()
        .filter(num -> num > 0)
        .mapToInt(Integer::intValue)
        .sum();
  }
}