package com.mgireesh;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {

	public int getFwdSum(ArrayList<NestedInteger> nestedList, int depth) {
		int sum = 0;
		for (int i = 0; i < nestedList.size(); i++) {
			if (nestedList[i].isInteger()) {
				sum += nestedList[i].getInteger();
			} else {
				sum += getFwdSum(nestedList[i].getList(), depth + 1);
			}
		}
		return sum * depth;
	}

	public int forwardDepthSum(List<NestedInteger> input) {
		return getFwdSum(input, 1);
	}

	private int maxDepth = 0;

	public void getRevSum(List<NestedInteger> nestedList, HashMap<Integer, Integer> map, int depth) {
		int sum = 0;
		for (int i = 0; i < nestedList.size(); i++) {
			if (nestedList[i].isInteger()) {
				sum += nestedList[i].getInteger();
				if (map.containsKey(depth)) {
					sum += map.get(depth);
				}
				map.put(depth, sum);
				maxDepth = Math.max(maxDepth, depth);
			} else {
				getRevSum(nestedList[i].getList(), depth + 1);
			}
		}
	}

	public int reversDepthSum(List<NestedInteger> input) {
		int sum = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		getRevSum(input, map, 1);

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			sum += (maxDepth - entry.getKey()) * entry.getValue();
		}

		return sum;
	}
}
