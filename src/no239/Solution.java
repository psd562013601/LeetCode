package no239;

public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int len = nums.length;
        if(len==0)
        	return new int[0];
        int[] ret = new int[len-k+1];
		ret[0] = Integer.MIN_VALUE;
		int index=-1;
		for (int i = 0; i <k; i++) {
			if(nums[i] >= ret[0]) {
				ret[0] = nums[i];
				index=i;
			}
		}
		for (int i = 1; i <= len - k; i++) {
			if (nums[i + k - 1] > ret[i - 1]) {
				ret[i] = nums[i + k - 1];
			} else {
				if(index < i) {
					ret[i] = Integer.MIN_VALUE;
					for (int j = i; j <i+k; j++) {
						if(nums[j] >= ret[i]) {
							ret[i] = nums[j];
							index=j;
						}
					}
				} else {
					ret[i] = ret[i-1];
				}
			}
        }
		return ret;
    }
}