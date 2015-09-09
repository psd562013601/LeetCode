package no179;

public class Solution {
	public String largestNumber(int[] num) {
		StringBuffer sb = new StringBuffer("");
		if (num.length == 0)
			return sb.toString();
		boolean flag = false;
		for (int i = num.length; i > 1 ; i--) {
			flag = false;
			for (int j = 0; j < i-1; j++) {
				String str1 = String.valueOf(num[j]) + String.valueOf(num[j+1]);
				String str2 = String.valueOf(num[j+1]) + String.valueOf(num[j]);
				if (str1.compareTo(str2) < 0) {
					num[j] = num[j] + num[j+1];
					num[j+1] = num[j] - num[j+1];
					num[j] = num[j] - num[j+1];
					flag = true;
				}
			}
			if (!flag) {
				break;
			}
		}
		flag = false;//是否已经有非零的数	
		for (int i = 0; i < num.length; i++) {
			if(num[i] != 0) {
				flag = true;
				sb.append(num[i]);
			} else {
				if(!flag)
					;
				else
					sb.append(num[i]);
			}
		}
		if(!flag)
			sb.append(0);
		return sb.toString();
	}

	public static void main(String[] args) {
		int num[] = { 0,0 };
		System.out.println(new Solution().largestNumber(num));

	}

}
