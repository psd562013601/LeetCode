package no55;

import java.util.Arrays;

public class Solution {
    public boolean canJump(int[] nums) {
    	if(null ==nums || nums.length==0)
    		return true;
    	boolean[] can = new boolean[nums.length];
    	Arrays.fill(can, false);
    	can[can.length-1]=true;
    	for(int i=nums.length-2; i>=0; i--) {
    		for(int n=1; n<=nums[i]; n++) {
    			if(i+n<can.length && can[i+n]==true) {
    				can[i]=true;
    				break;
    			}
    		}
    	}
    	return can[0];
    }
    
    
    public static void main(String[] args) {
    	int[] nums = {2,3,1,1,4};

		System.out.println(new Solution().canJump(nums));
	}
}