/*
 Given an integer array nums where every element appears three times except for one, which appears exactly once. Find the single element and return it.

You must implement a solution with a linear runtime complexity and use only constant extra space.

 

Example 1:

Input: nums = [2,2,3,2]
Output: 3
Example 2:

Input: nums = [0,1,0,1,0,1,99]
Output: 99
*/

class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int i;
        if(nums.length==1){return nums[0];}
        if(nums[nums.length-1]!=nums[nums.length-2]){return nums[nums.length-1];}
        for(i=1;i<nums.length-1;i++){
            if(nums[0]!=nums[1]){return nums[0];}
            if(nums[i]!=nums[i-1]){
                if(nums[i+1]!=nums[i]){ return nums[i];}
                else{continue;}
               
            }
        }
        
   return -1; }
    }
