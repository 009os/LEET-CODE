/*Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

 

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.*/

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a=nums1.length;
        int b=nums2.length;
        int c =a+b;
        int []arr=new int[c];

        int i=0,j=0,k=0;
        while(i<a && j<b)
        {
            if(nums1[i]<nums2[j]){
                arr[k]=nums1[i];
                i++;
            }

            else{
                arr[k]=nums2[j];
                j++;
            }
            k++;
        }

        while(i<a){
            arr[k]=nums1[i];
            i++;
            k++;
        }
        while(j<b){
            arr[k]=nums2[j];
            j++;
            k++;
        }
        int s =arr.length;

        if(s%2==0)
        {
            return ((double)(arr[s/2 -1]+arr[s/2])/2);
        }

        else{
            return arr[s/2];
        }

        
    }
}