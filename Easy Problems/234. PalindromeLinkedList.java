/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head, fast = head, rev = null, temp;
        while(fast != null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        while(slow!=null){
            temp = rev;
            rev = slow;
            slow=slow.next;
            rev.next = temp;
        }
        while(rev != null) {        
            if(head.val != rev.val) return false;
            head = head.next;
            temp = rev;
            rev = rev.next;
            temp.next = slow;
            slow = temp;
        }
        return true;
    }
}