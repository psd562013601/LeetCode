package no202;

import java.util.HashSet;

public class Solution {
	public boolean isHappy(int n) {
		if (0 == n)
			return false;
		if (1 == n)
			return true;
		HashSet<Integer> hash = new HashSet<>();
		int nn = n;
		while (!hash.contains(nn)) {
			hash.add(nn);
			int sum = 0;
			while (nn != 0) {
				int x = nn % 10;
				sum = sum + x * x;
				nn = nn / 10;
			}
			nn = sum;
			if (1 == nn)
				return true;
		}
		return false;
	}
}
