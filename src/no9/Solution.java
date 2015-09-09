package no9;

public class Solution {
	public boolean isPalindrome(int x) {
		if (x < 0)
			return false;
		if (x < 10)
			return true;
		int len = 0;
		int xx = x;
		while (xx != 0) {
			len++;
			xx /= 10;
		}
		System.out.println(len);
		xx = x;
		for (int i = len; i > 1; i -= 2) {
			if (xx % 10 != (xx / (int) (Math.pow(10, i - 1))) % 10) {
				return false;
			}
			xx = ((xx / 10) % (int) (Math.pow(10, i - 2)));
			System.out.println(xx);
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(new Solution().isPalindrome(10));
	}
}