package no6;


public class Solution {
	public String convert(String s, int numRows) {
		if(1==numRows)
			return s;
		StringBuilder sb=new StringBuilder();
		
		int offset = 2*numRows -2;
		for (int i = 0; i < numRows; i++) {
			int b=i*2;
			for(int j=i; j<s.length(); ) {
				sb.append(s.charAt(j));
				int add = offset-b;
				b=add;
				if(0==add) {
					add = offset;
				}
				j+=add;
			}
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(new Solution().convert("A", 1));
	}
}
