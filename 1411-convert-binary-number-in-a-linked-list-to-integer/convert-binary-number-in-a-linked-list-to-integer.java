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
    public int getDecimalValue(ListNode head) {
        int ans =0;
        int count =0;
        ListNode temp = head;
        while(temp.next!=null){
            count++;
            temp= temp.next;
        }
        temp = head;
        while(temp!=null){
            int a = temp.val*(int)(Math.pow(2,count));
            ans += a;
            count--;
            temp = temp.next;
        }
        return ans;

    }
}