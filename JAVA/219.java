/*
 Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

 

Example 1:

Input: nums = [1,2,3,1], k = 3
Output: true
Example 2:

Input: nums = [1,0,1,1], k = 1
Output: true
Example 3:

Input: nums = [1,2,3,1,2,3], k = 2
Output: false
*/
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map <Integer,Integer> mp = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++) {
            if (mp.containsKey(nums[i]) && i-mp.get(nums[i])<=k){
                return true;
            }
            
            else {mp.put(nums[i],i);}
        }
        
        return false;
    }
    }
    /*NAIVE SOLUTION
    class Solution {
        public boolean containsNearbyDuplicate(int[] nums, int k) {
            for(int i=0;i<nums.length-1;i++){
                for(int j=i+1;j<nums.length;j++){
                    if(nums[i]==nums[j] && Math.abs(i-j)<=k){
                        return true;
                    }
    
                }
            }
        return false;
        }
    }
     */