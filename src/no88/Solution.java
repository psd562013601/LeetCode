package no88;

import java.util.Arrays;


public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
		if (0 == n) {
			return;
		}
		if (0 == m) {
        	for(int k=n-1; k>=0; k--) {
        		nums1[k] = nums2[k];
        	}
			return;
		}
    	
        int i=m-1;
        int j=n-1;
        if(nums1[0]<=nums1[i] || nums2[0]<=nums2[j]) {//从小到大
            while(i>=0 && j>=0) {
            	if(nums1[i]>=nums2[j]) {
            		nums1[i+j+1] = nums1[i];
            		i--;
            	} else {
            		nums1[i+j+1] = nums2[j];
            		j--;
            	}
            }
        } else {
            while(i>=0 && j>=0) {
            	if(nums1[i]<=nums2[j]) {
            		nums1[i+j+1] = nums1[i];
            		i--;
            	} else {
            		nums1[i+j+1] = nums2[j];
            		j--;
            	}
            }
        }
        if(j>=0) {
        	for(int k=j; k>=0; k--) {
        		nums1[k] = nums2[k];
        	}
        }
        
    }
    
    
    
    public static void main(String[] args) {
    	int m=0, n=3;
    	int[] nums1=new int[m+n];
//    	nums1[0]=2;
//    	nums1[1]=3;
//    	nums1[2]=5;
//    	nums1[3]=7;
//    	nums1[4]=9;
    	int[] nums2 = {0,1,16};
    	
    	new Solution().merge(nums1, m, nums2, n);
    	
    	System.out.println(Arrays.toString(nums1));
    	
	}
}
