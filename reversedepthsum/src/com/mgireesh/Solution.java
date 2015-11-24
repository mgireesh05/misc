package com.mgireesh;

public class Solution {

	/// **
	// * This is the interface that represents nested lists. You should not
	/// implement
	// * it, or speculate about its implementation.
	// */
	// public interface NestedInteger {
	// /**
	// * @return true if this NestedInteger holds a single integer, rather than
	/// a
	// * nested list
	// */
	// boolean isInteger();
	//
	// /**
	// * @return the single integer that this NestedInteger holds, if it holds a
	// * single integer Return null if this NestedInteger holds a nested
	// * list
	// */
	// Integer getInteger();
	//
	// /**
	// * @return the nested list that this NestedInteger holds, if it holds a
	// * nested list Return null if this NestedInteger holds a single
	// * integer
	// */
	// List<NestedInteger> getList();
	// }
	//
	/// *-----Input----*/
	// {{1,2},3,{4,{5,6}}}
	//
	/// *-----Solution----*/
	// public int reverseDepthSum (List<NestedInteger> input)
	// {
	// int findMaxinList(List<NestedInteger>){
	// int currMax = 0;
	// for(int i = 0; i < list.length(); i++){
	// currMax = Max(currMax, findDepth(list[i]));
	// }
	// return currMax;
	// }
	//
	// int findDepth(NestedInteger input){
	// int depth = 0;
	//
	// if(null == getInteger()){
	// if(null == input.getInteger()){
	// list = input.getList();
	// return findMaxinList(list);
	// }
	// }else{
	// if(input.isInteger()){
	// return depth+1;
	// }
	// }
	// }
	//
	// int getSum(NestedInteger list, int weight){
	//
	// }
	//
	// // implementation here
	// int maxNested = findMaxInlist(input);
	//
	// }
	//
	// depth 1:3=3 at weight 3
	// depth 2:1,2,4=7 at weight 2
	// depth 3:5,6=11 at weight 1
	// so 9+14+11=34

}
