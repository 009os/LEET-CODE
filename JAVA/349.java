/*
 Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

 

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.
*/


class Solution {
    public static int[] intersection(int[] nums1, int[] nums2)
 {
     HashSet<Integer> set1 = new HashSet<>();
     HashSet<Integer> set2 = new HashSet<>();

     for (int i=0;i<nums1.length;i++) {
         set1.add(nums1[i]);
     }

     for (int j=0;j<nums2.length;j++) {
         if (set1.contains(nums2[j]))
             set2.add(nums2[j]);
     }

     int [] result = new int[set2.size()];
         int index = 0;
     for (int n : set2){
         result[index] = n;
         index++;
     }
     
     return result;
 }

}