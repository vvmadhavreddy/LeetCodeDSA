/**
* 2. Add Two Numbers
* You are given two non-empty linked lists representing two non-negative integers. 
* The digits are stored in reverse order, and each of their nodes contains a single digit. 
* Add the two numbers and return the sum as a linked list.
*
* You may assume the two numbers do not contain any leading zero, except the number 0 itself.
*/
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode finalResult = new ListNode(0);
        ListNode ptr = finalResult;
        
        int carry = 0;
        while(l1 != null || l2 != null){
            int sum = 0, result = 0;

            int l1_val = (l1 != null) ? l1.val : 0;
            int l2_val = (l2 != null) ? l2.val : 0;

            sum = l1_val + l2_val + carry;

            result = sum % 10;
            carry = sum/10;

            ListNode twoNumResult = new ListNode(result);

            ptr.next = twoNumResult;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
            ptr = ptr.next;
        }

        if(carry > 0){
            ListNode carryNode = new ListNode(carry);
            ptr.next = carryNode;
        }

        return finalResult.next;
    }
}
