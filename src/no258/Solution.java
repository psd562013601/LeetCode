package no258;

public class Solution {
    public int addDigits(int num) {
        int nn=num;
        while (nn/10 != 0) {
        	int sum=0;
			while (nn != 0) {
				sum += nn % 10;
				nn /= 10;
			}
			nn = sum;
		}
        return nn;
    }
}