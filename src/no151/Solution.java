package no151;

public class Solution {
	public String reverseWords(String s) {
		String sarray[] = s.split(" ");
		String ret = "";
		for(String curr:sarray) {
			if(curr.length()==0)
				continue;
			if(ret.length()>0)
				ret = " " + ret;
			ret = curr+ret;
		}
		return ret;
	}

}
