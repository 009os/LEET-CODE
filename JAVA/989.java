/*
 * The array-form of an integer num is an array representing its digits in left to right order.

For example, for num = 1321, the array form is [1,3,2,1].
Given num, the array-form of an integer, and an integer k, return the array-form of the integer num + k.

 

Example 1:

Input: num = [1,2,0,0], k = 34
Output: [1,2,3,4]
Explanation: 1200 + 34 = 1234
Example 2:

Input: num = [2,7,4], k = 181
Output: [4,5,5]
Explanation: 274 + 181 = 455
Example 3:

Input: num = [2,1,5], k = 806
Output: [1,0,2,1]
Explanation: 215 + 806 = 1021
 */

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int i = num.length - 1, carry = 0;
        LinkedList<Integer> ans = new LinkedList<>();
        while (i >= 0 || k > 0 || carry > 0) {
            if (i < 0) {
                carry += k % 10;
            }

            else {
                carry += num[i] + k % 10;
                i--;
            }

            ans.addFirst(carry % 10);
            carry /= 10;
            k /= 10;
        }
        return ans;
    }
}

/*
 * class Solution {
 * public List<Integer> addToArrayForm(int[] num, int k) {
 * long number =0;
 * for(int i=0;i<num.length;i++){
 * number = number + (long)(num[i]*Math.pow(10,num.length-1-i));
 * }
 * 
 * number=number+k;
 * ArrayList<Integer> l = new ArrayList<>();
 * while(number!=0){
 * l.add((int)number%10);
 * number=number/10;
 * }
 * Collections.reverse(l);
 * return l;
 * 
 * 
 * 
 * }
 * }
 */