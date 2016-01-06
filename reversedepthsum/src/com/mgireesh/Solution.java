package com.mgireesh;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

	public int getFwdSum(List<NestedInteger> nestedList, int depth) {
		int sum = 0;
		for (int i = 0; i < nestedList.size(); i++) {
			if (nestedList.get(i).isInteger()) {
				sum += nestedList.get(i).getInteger() * depth;
			} else {
				sum += getFwdSum(nestedList.get(i).getList(), depth + 1);
			}
		}
		return sum;
	}

	public int forwardDepthSum(List<NestedInteger> input) {
		return getFwdSum(input, 1);
	}

	private int maxDepth = 0;

	public void getRevSum(List<NestedInteger> nestedList, Map<Integer, Integer> map, int depth) {
		int sum = 0;
		int val = 0;
		for (int i = 0; i < nestedList.size(); i++) {
			if (nestedList.get(i).isInteger()) {
				val = nestedList.get(i).getInteger();
				if (map.containsKey(depth)) {
					sum = map.get(depth) + val;
				} else {
					sum = val;
				}
				map.put(depth, sum);
				maxDepth = Math.max(maxDepth, depth);
			} else {
				getRevSum(nestedList.get(i).getList(), map, depth + 1);
			}
		}
	}

	public int reverseDepthSum(List<NestedInteger> input) {
		int sum = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		getRevSum(input, map, 1);

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			sum += (maxDepth + 1 - entry.getKey()) * entry.getValue();
		}

		return sum;
	}
}
