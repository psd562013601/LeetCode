package no119;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Long> getRow(int rowIndex) {
        List<Long> l = new ArrayList<Long>();

		l.add(1L);
		int i = 1;
		while(i<=rowIndex/2) {
			l.add(l.get(i-1) * (rowIndex-i+1) / i);
			i++;
		}
		while(i<=rowIndex) {
			l.add(l.get(rowIndex-i));
			i++;
		}
		
		return l;
    }
	
	public static void main(String []args) {
		new Solution().getRow(3);
	}
}
