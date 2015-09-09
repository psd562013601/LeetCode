package no191;

/**
 * Number of 1 Bits
 * @author psd
 *
 */
public class Solution {
	public long hammingWeight(long n) {
		if (n == 0)
			return 0;
		else if (n < 0)
			return 1 + hammingWeight(n-2^32);
		else
			return n % 2 + hammingWeight(n / 2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Solution().hammingWeight(11));
		System.out.println(new Solution().hammingWeight(152341));
		System.out.println(new Solution().hammingWeight(1111));
		System.out.println(new Solution().hammingWeight(2147483648L));
	}

}
