package no118;

import java.util.ArrayList;
import java.util.List;

public class Solution {    
	
	public List<Long> getRow(int rowIndex) {
		List<Long> l = new ArrayList<Long>();

		l.add(1L);
		int i = 1;
		while (i <= rowIndex / 2) {
			l.add(l.get(i - 1) * (rowIndex - i + 1) / i);
			i++;
		}
		while (i <= rowIndex) {
			l.add(l.get(rowIndex - i));
			i++;
		}

		return l;
	}
	
    public List<List<Long>> generate(int numRows) {
    	List<List<Long>> ll = new ArrayList<List<Long>>();
    	for(int i=0; i<numRows; i++) {
    		ll.add(getRow(i));
    	}
    	return ll;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
