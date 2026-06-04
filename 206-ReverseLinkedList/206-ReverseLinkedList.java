// Last updated: 6/4/2026, 10:29:44 PM
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode node = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = node;
            node = head;
            head = temp;
        }
        return node;        
    }
}