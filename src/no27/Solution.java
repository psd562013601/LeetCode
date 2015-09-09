package no27;

import java.util.Arrays;

public class Solution {
	public int removeElement(int[] nums, int val) {
		int i=0;
		int j=nums.length-1;
		while(i<=j) {
			if(val == nums[j])
				j--;
			else {
				if(val==nums[i]) {
					nums[i++] = nums[j--];
				} else {
					i++;
				}
			}
		}
		return i;
	}
	
	public static void main(String[] args) {
		int[] nums = {1,2,4,4,5,4};
		int val = 4;
		System.out.println(new Solution().removeElement(nums, val));
		System.out.println(Arrays.toString(nums));
	}
}