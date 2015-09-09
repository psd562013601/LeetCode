package no189;

/**
 * Rotate Array
 * @author psd
 *
 */
public class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if(k < n-1) {
        	reverse(nums, 0, n-k-1);
        	reverse(nums, n-k, n-1);
        	reverse(nums, 0, n-1);
        }
    }
    
    private void reverse(int [] nums, int start, int end) {
    	if(start<end) {
    		int len = end-start +1;
    		for(int i = start; i<start + len/2; i++) {
    			nums[i] = nums[i]^nums[start+end-i];
    			nums[start+end-i] = nums[i]^nums[start+end-i];
    			nums[i] = nums[i]^nums[start+end-i];
    		}
    	}
    }
	public static void main(String[] args) {
		int nums[] = {1,2};
		new Solution().rotate(nums, 3);

	}

}
