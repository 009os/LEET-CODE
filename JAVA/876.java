/*Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.

 

Example 1:


Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node of the list is node 3.
Example 2:


Input: head = [1,2,3,4,5,6]
Output: [4,5,6]
Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.
 */

 class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode curr = head;
        ListNode curr1=head;
        int count=0;
        while(curr!=null){
            count++;
            curr=curr.next;
        }
        for(int i=0;i<count/2;i++){
                curr1=curr1.next;
            }
            head=curr1;
            return head;

        
   }
}