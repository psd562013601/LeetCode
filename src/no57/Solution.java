package no57;

import java.util.ArrayList;
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
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
    	List<Interval> ret = new ArrayList<Interval>();
    	int a = newInterval.start,b = newInterval.end;
    	boolean flag = false;//ÊÇ·ñÌí¼Ó
    	if(null ==intervals || 0 == intervals.size()) {
    		ret.add(new Interval(a, b));
    		return ret;
    	}
        for(Interval interval : intervals) {
        	if(interval.end < newInterval.start) {
        		ret.add(interval);
        	} else {
        		a=Math.min(a, interval.start);
        	}
        	if(interval.start > newInterval.end) {
        		if(!flag) {
        			ret.add(new Interval(a, b));
        			flag = true;
        		}
        		ret.add(interval);
        		
        	}else {
        		b=Math.max(b, interval.end);
        	}
        }
		if(!flag) {
			ret.add(new Interval(a, b));
			flag = true;
		}
        return ret;
    }
}