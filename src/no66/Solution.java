package no66;

public class Solution {
	public int[] plusOne(int[] digits) {
		int carry = 0;
		for (int i = digits.length - 1; i >= 0; i--) {
			carry = digits[i] + 1;
			digits[i] = carry % 10;
			carry /= 10;
			if(0==carry)
				break;
		}
		if(0 != carry) {
			int[] ret = new int[digits.length+1];
			ret[0] = carry;
			return ret;
		}
		return digits;
	}
}