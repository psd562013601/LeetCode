package no58;

public class Solution {
    public int lengthOfLastWord(String s) {
        int ret=0;
        s =s.trim();
        int len = s.length();
        for(int i=len-1; i>=0; i--) {
        	if(s.charAt(i) == ' ')
        		break;
        	else
        		ret++;
        }
        return ret;
    }
}