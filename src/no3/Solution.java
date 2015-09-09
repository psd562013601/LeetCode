package no3;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        
        Map<Character, Integer> p = new HashMap<>();
        
        int[] l = new int[n];
        
        for(int i=0; i<n; i++) {
        	if(0==i){
        		l[i] = 0;
        	} else {
        		if(p.containsKey(s.charAt(i))) {// 出现过该字符
        			l[i] = Math.max(l[i-1], p.get(s.charAt(i))+1);
        		} else {
        			l[i] = l[i-1];
        		}
        	}
        	p.put(s.charAt(i), i);
        }
        
        int ans=0;
        for(int i=0; i<n; i++) {
        	ans = Math.max(ans, i-l[i] +1);
        }
        return ans;
    }
    
    public static void main(String[] args) {
		String s= "asda";
		
		System.out.println(new Solution().lengthOfLongestSubstring(s));
	}
}
