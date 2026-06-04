// Last updated: 6/4/2026, 10:28:39 PM
class Solution {
  public int getDecimalValue(ListNode head) {
    int ans = 0;

    for (; head != null; head = head.next)
      ans = ans * 2 + head.val;

    return ans;
  }
}