package com.mgireesh;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<NestedInteger> inputList = new ArrayList<NestedInteger>();
		// {{1,2},3,{4,{5,6}}}

		List<NestedInteger> list1 = new ArrayList<NestedInteger>();
		list1.add(new NestedIntegerImpl(1));
		list1.add(new NestedIntegerImpl(2));

		inputList.add(new NestedIntegerImpl(list1));

		inputList.add(new NestedIntegerImpl(3));

		List<NestedInteger> list2 = new ArrayList<NestedInteger>();
		list2.add(new NestedIntegerImpl(4));

		List<NestedInteger> list3 = new ArrayList<NestedInteger>();
		list3.add(new NestedIntegerImpl(5));
		list3.add(new NestedIntegerImpl(6));

		list2.add(new NestedIntegerImpl(list3));

		inputList.add(new NestedIntegerImpl(list2));

		System.out.println(inputList.toString());

		Solution sol = new Solution();
		System.out.println(sol.forwardDepthSum(inputList));
		System.out.println(sol.reverseDepthSum(inputList));

	}

}
