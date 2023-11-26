/*Given the head of a singly linked list, return true if it is a 
palindrome
 or false otherwise.

 

Example 1:


Input: head = [1,2,2,1]
Output: true
Example 2:


Input: head = [1,2]
Output: false*/

class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode curr = head;
        ArrayList ar = new ArrayList<>();
        while(curr!=null){
            ar.add(curr.val);
            curr=curr.next;
        }
        for(int i=0;i<ar.size();i++){
            if(ar.get(i)==ar.get(ar.size()-1-i)){continue;}
            else{return false;}
        }

        return true;
        
    }
}