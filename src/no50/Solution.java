package no50;

public class Solution {
	public double myPow(double x, int n) {
		double ret = 1.0;
		if (x > -0.0000001 && x < 0.0000001)
			return 0.0;
		if (x == 1)
			return 1.0;
		int nn = Math.abs(n);
		if (x == -1) {
			if (nn % 2 == 0)
				return 1.0;
			else
				return -1.0;
		}
		if (0 == nn)
			return ret;
		for (int i = 0; i < nn; i++) {
			ret = ret * x;
			if (ret > -0.0000001 && ret < 0.0000001)
				return 0.0;
		}
		if (n < 0) {
			if (ret > -0.0000001 && ret < 0.0000001)
				return 0.0;
			else
				ret = 1 / ret;
		}
		return ret;
	}

	public static void main(String[] args) {
		System.out.println(new Solution().myPow(5, -4));
	}
}