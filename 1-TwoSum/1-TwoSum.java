// Last updated: 6/4/2026, 10:30:55 PM
class Solution {
  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> numToIndex = new HashMap<>();

    for (int i = 0; i < nums.length; ++i) {
      if (numToIndex.containsKey(target - nums[i]))
        return new int[] {numToIndex.get(target - nums[i]), i};
      numToIndex.put(nums[i], i);
    }

    throw new IllegalArgumentException();
  }
}