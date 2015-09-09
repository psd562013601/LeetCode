package no204;

import java.util.Arrays;

public class Solution {
	public int countPrimes(int n) {
    	if(n<=2)
    		return 0;
        boolean[] p = new boolean[n];
        Arrays.fill(p, true);
        int q = (int) Math.sqrt(n);
        for(int i=2; i<=q; i++) {
        	int x=i+i;
        	while(x<n) {
        		p[x] = false;
        		x=x+i;
        	}
        }
        int ret=0;
        for(int j=2; j<n; j++) {
        	ret = p[j] ? ret+1 : ret;
        }
        return ret;
    }
}