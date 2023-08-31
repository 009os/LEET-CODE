/*Given a string containing just the characters '(' and ')', return the length of the longest valid (well-formed) parentheses 
substring
.

 

Example 1:

Input: s = "(()"
Output: 2
Explanation: The longest valid parentheses substring is "()".
Example 2:

Input: s = ")()())"
Output: 4
Explanation: The longest valid parentheses substring is "()()".
Example 3:

Input: s = ""
Output: 0*/

class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int n = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == '(')
                st.push(i);
            else if(s.charAt(i) == ')')
            {
                st.pop();
                if(st.empty())
                    st.push(i);
                else
                    n = Math.max(n, i - st.peek());
            }
        }
        return n;
    }
}

/*

ANOTHER LOGIC

let 

left=0,right=0,max=0;
if("(" found left++) else(right++)
if(left==right)(max=Math.max(max,left*2))
else if(right>left)(reset left =0  and right =0)

*/
