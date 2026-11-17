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
    public ListNode sortList(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode temp = head;
        int size =0;
        while(temp!=null){
            temp = temp.next;
            size++;
        }
        int ans[]= new int[size];
        size =0;
        temp = head;
        while(temp!=null){
            ans[size]=temp.val;
            temp = temp.next;
            size++;
        }
        Arrays.sort(ans);
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        for(int i =0;i<ans.length;i++){
            curr.next = new ListNode(ans[i]);
            curr = curr.next;
        }
        return dummy.next;
    }
}


// import java.util.Arrays;

// class Solution {
//     public ListNode sortList(ListNode head) {

//         if(head == null || head.next == null) {
//             return head;
//         }

//         // Step 1: Count nodes
//         ListNode temp = head;
//         int size = 0;

//         while(temp != null) {
//             size++;
//             temp = temp.next;
//         }

//         // Step 2: Store values in array
//         int[] ans = new int[size];

//         temp = head;
//         size = 0;

//         while(temp != null) {
//             ans[size] = temp.val;
//             temp = temp.next;
//             size++;
//         }

//         // Step 3: Sort array
//         Arrays.sort(ans);

//         // Step 4: Create sorted linked list
//         ListNode dummy = new ListNode(-1);
//         ListNode curr = dummy;

//         for(int i = 0; i < ans.length; i++) {
//             curr.next = new ListNode(ans[i]);
//             curr = curr.next;
//         }

//         // Step 5: Return sorted linked list
//         return dummy.next;
//     }
// }