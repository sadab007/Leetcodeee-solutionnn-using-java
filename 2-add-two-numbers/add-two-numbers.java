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
        int carry=0;
        ListNode temp1=l1;
        ListNode temp2=l2;
        ListNode ans=new ListNode(0);
        ListNode ans1=ans;
        

        while(temp1!=null && temp2!=null){
            int sum=temp1.val+temp2.val+carry;

            carry=sum/10;
            int last_digit=sum%10;

            ListNode new_node=new ListNode(last_digit);
            ans1.next=new_node;
            ans1=ans1.next;
            temp1=temp1.next;
            temp2=temp2.next;
        }

        while(temp1!=null){
            int sum=temp1.val+carry;
            int last_digit=sum%10;
            carry=sum/10;
            ListNode new_node=new ListNode(last_digit);
            ans1.next=new_node;
            ans1=ans1.next;
            temp1=temp1.next;
        }
        while(temp2!=null){
            int sum=temp2.val+carry;
            int last_digit=sum%10;
            carry=sum/10;
            ListNode new_node=new ListNode(last_digit);
            ans1.next=new_node;
            ans1=ans1.next;
            temp2=temp2.next;
        }

        if(carry!=0){
            ListNode new_node=new ListNode(carry);
            ans1.next=new_node;
            ans1=ans1.next;
        }

        return ans.next;
    }
}