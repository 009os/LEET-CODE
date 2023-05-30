/*7. Reverse Integer

Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 

Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21
 

Constraints:

-231 <= x <= 231 - 1 */

class Solution {
    public int reverse(int x) {
        int sum=0, r;
        
        while(x!=0){
            r=x%10;
            
            x=x/10;
              if (sum > Integer.MAX_VALUE/10 || (sum == Integer.MAX_VALUE / 10 && r > 7)) 
                  return 0;
            if (sum  < Integer.MIN_VALUE/10 || (sum == Integer.MIN_VALUE / 10 && r < -8)) 
                return 0;
            sum= sum*10+r;
        }
        
    
        return sum;
    }
}