package no45;

/**
 * Jump Game II
 * @author psd
 *
 */
public class Solution {
    public int jumpA[];
    public int jump(int[] A) {
        jumpA = new int[A.length];
        for(int i = 0; i< jumpA.length; i++) {
        	jumpA[i] = -1;
        }
        return jumpFromi(A, 0);
    }
    
    public int jumpFromi(int[] A, int i) {
    	if(jumpA[i] >=0)
    		return jumpA[i];
    	if(i==A.length-1) {
    		jumpA[i] = 0;
    		return 0;
    	}
    	else {
    		int c = A.length -1 - i;
    		int ai = Math.min(A[i], c);
    		while(ai>0) {
    			int curr = jumpFromi(A, i+ai);
    			ai--;
    			if (curr < c)
    				c = curr;
    		}
    		jumpA[i] = 1+c;
    		return 1+c;
    	}
    }
    
    public static void main(String [] args) {
    	int[] A = {2, 1};
		System.out.println(new Solution().jump(A));
    }
}
