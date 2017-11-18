/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode prev = new ListNode(0);
        ListNode head = prev;
        int carry = 0;
        while(l1!=null||l2!=null||carry!=0){
            int sum = ((l1==null)?0:l1.val) + ((l2==null)?0:l2.val)+carry;
            ListNode temp = new ListNode(sum%10);
            carry = sum/10;
            l1 = l1==null?l1:l1.next;
            l2 = l2==null?l2:l2.next;
            prev.next = temp;
            prev = temp;
        }
        return head.next;
    }
}