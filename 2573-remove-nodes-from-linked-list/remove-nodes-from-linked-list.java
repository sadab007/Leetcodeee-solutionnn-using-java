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
    public ListNode removeNodes(ListNode head) {
        Stack<Integer> ss = new Stack<>();
        ListNode temp = head;
        while(temp!= null){
            while(!ss.isEmpty()&& ss.peek()<temp.val){
                ss.pop();
            }  
            ss.push(temp.val); 
            temp = temp.next;
        }
        temp =new ListNode(0);
        while(ss.size()>0){
            ListNode num = new ListNode(ss.pop());
            num.next = temp.next;
            temp.next = num;
        }
        return temp.next;
    }
}