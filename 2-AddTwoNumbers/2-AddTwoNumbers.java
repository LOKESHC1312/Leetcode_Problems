// Last updated: 6/4/2026, 10:30:53 PM
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return helper(l1, l2, 0);
    }
    private ListNode helper(ListNode l1, ListNode l2, int carry) {
        if (l1 == null && l2 == null && carry == 0) return null;
        int temp = carry;
        if (l1 != null) temp += l1.val;
        if (l2 != null) temp += l2.val;
        ListNode ans = new ListNode(temp % 10);
        ans.next = helper(l1 != null ? l1.next : null,
                          l2 != null ? l2.next : null,
                          temp / 10);
        return ans;
    }
}