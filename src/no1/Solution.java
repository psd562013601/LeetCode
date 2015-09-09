package no1;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {
	public int[] twoSum(int[] numbers, int target) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < numbers.length; i++) {
			int curr = numbers[i];
			if (hm.containsKey(curr)) 
				return new int[] { hm.get(curr)+1, i+1 };
			else {
				//hm.put(numbers[i], i);
				hm.put(target - numbers[i], i);
			}
		}
		return null;
	}

	public static void main(String[] args) {
		int numbers[] = {230,863,916,585,981,404,316,785,88,12,70,435,384,778,887,755,740,337,86,92,325,422,815,650,920,125,277,336,221,847,168,23,677,61,400,136,874,363,394,199,863,997,794,587,124,321,212,957,764,173,314,422,927,783,930,282,306,506,44,926,691,568,68,730,933,737,531,180,414,751,28,546,60,371,493,370,527,387,43,541,13,457,328,227,652,365,430,803,59,858,538,427,583,368,375,173,809,896,370,789 };
		int target = 542;
		int ret[] =new Solution().twoSum(numbers,target);
		System.out.println(Arrays.toString(ret));		
		System.out.println(numbers[ret[0]-1] +", "+numbers[ret[0]-1]);
	}

}
