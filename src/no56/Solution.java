package no56;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import node.Interval;

/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public List<Interval> merge(List<Interval> intervals) {
    	List<Interval> ret  = new ArrayList<>();
        if(null==intervals || 0==intervals.size()) {
        	return ret;
        }
        
        int minindex=intervals.get(0).start;
        int maxindex=intervals.get(0).end;
        
        for(Interval interval : intervals) {
        	minindex = Math.min(minindex, interval.start);
        	maxindex = Math.max(maxindex, interval.end);
        }
        int offset = minindex;
        int[] array = new int[maxindex-minindex+1];
        Arrays.fill(array, -1);
        for(Interval interval : intervals) {
        	int st = interval.start;
        	while(st < interval.end) {
        		array[st-offset]=1;
        		st++;
        	}
        	if(array[st-offset] == -1)
        		array[st-offset]=0;
        }
        int a=0,b=0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 1 && array[a] != 1)
				a = i;
			if (array[i] == 0) {
				b = i;
				if(array[a]!=1)
					a=i;
				ret.add(new Interval(a+offset, b+offset));
				a=b+1;
			}
        }
		return ret;
    }
    
    
    public static void main(String[] args) {
    	List<Interval> intervals = new ArrayList<>();
    	intervals.add(new Interval(8,9));
    	intervals.add(new Interval(5,8));
    	
    	System.out.println(Arrays.toString((new Solution().merge(intervals).toArray())));
	}
}