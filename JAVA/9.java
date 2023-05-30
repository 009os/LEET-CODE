/*9. Palindrome Number

Given an integer x, return true if x is a 
palindrome
, and false otherwise.

 

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 

Constraints:

-231 <= x <= 231 - 1 */

class Solution {
    public boolean isPalindrome(int x) {
        int y;
        y=x;
        int num=0;
        while(y!=0){
            num=num*10+(y%10);
            y=y/10;
        }

        if(num==x && x>=0)
        {
            return true;
        }

        else
        {
            return false;
        }
        
    }
}