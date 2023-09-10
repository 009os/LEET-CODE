/*
 Given an integer array nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once. You can return the answer in any order.

You must write an algorithm that runs in linear runtime complexity and uses only constant extra space.

 

Example 1:

Input: nums = [1,2,1,3,2,5]
Output: [3,5]
Explanation:  [5, 3] is also a valid answer.
Example 2:

Input: nums = [-1,0]
Output: [-1,0]
Example 3:

Input: nums = [0,1]
Output: [1,0]
*/

class Solution {
    public int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
        int [] arr=new int[2];
        int i;
        int m=1;
        if(nums.length==2){return nums;}
        if(nums[nums.length-1]!=nums[nums.length-2]){arr[1]=nums[nums.length-1];
        m--;}
        if(nums[0]!=nums[1]){arr[m]=nums[0];
            m--;}
        for(i=1;i<nums.length-1;i++){

            if(nums[i]!=nums[i-1] && m>=0){
                if(nums[i+1]!=nums[i]){ arr[m]=nums[i];
                m--;}
                else{continue;}
               
            }
        }
        
   return arr;
    }
}