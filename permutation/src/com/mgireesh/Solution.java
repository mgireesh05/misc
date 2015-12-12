package com.mgireesh;

import java.util.ArrayList;

public class Solution {

	public ArrayList<String> permutate(String s) {
		ArrayList<String> answer = new ArrayList<String>();

		if (s.length() == 1) {
			answer.add(s);
			return answer;
		}
		String subStr = s.substring(0, s.length() - 1);
		char lastChar = s.charAt(s.length() - 1);
		answer = permutate(subStr);
		answer = insert(answer, lastChar);
		return answer;
	}

	public ArrayList<String> insert(ArrayList<String> list, char newChar) {
		ArrayList<String> newList = new ArrayList<String>();

		for (int i = 0; i < list.size(); i++) {
			String elem = list.get(i);
			insert(newList, elem, newChar);
		}

		return newList;
	}

	public void insert(ArrayList<String> list, String str, char newChar) {

		String temp = null;
		for (int j = 0; j < str.length(); j++) {
			temp = str.substring(0, j) + newChar + str.substring(j, str.length());
			list.add(temp);
		}
		temp = str + newChar;
		list.add(temp);
	}

}