
import java.util.*;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1=nums1.length;
        int l2=nums2.length;
        int arr[]=new int[l1+l2];
        int j=0;
        for(int i=0;i<l1;i++)
        {
            arr[j]=nums1[i];
            j++;
            
        }
        for(int i=0;i<l2;i++)
        {
            arr[j]=nums2[i];
            j++;
        }
        Arrays.sort(arr);
        int l3=arr.length;
       
        double d=0;
        if(l3%2!=0)
        {
            d=arr[l3/2];
        }
        else{
            int l4=arr.length-1;
            int s=l4/2;
            int s2=s+1;
            int a=arr[s];
            int b=arr[s2];
            int k=a+b;
            d=k/2.0;
        }
        return d;
    }
   
}