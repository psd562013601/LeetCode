package no154;

public class Solution {
    public int findMin(int[] num) {
        return find(num, 0, num.length-1);
    }
    
    private int find(int[] num, int s, int e) {
    	if (1 == e-s)
    		return Math.min(num[s], num[e]);
        if(num[e] > num[s])
        	return num[s];
    	if(num[e] == num[s]) {
    		while(s<e && num[s+1] == num[s])
    			s++;
    		while(e>s && num[e-1] == num[e])
    			e--;
    	}
    	if(e==s) 
    		return num[s];
    	int mid = (e+s+1)/2;
    	if(num[mid] >= num[s])
    		return find(num, mid+1, e);
    	else
    		return find(num, s, mid);
    }
    
	public static void main(String[] args) {
	}

}
