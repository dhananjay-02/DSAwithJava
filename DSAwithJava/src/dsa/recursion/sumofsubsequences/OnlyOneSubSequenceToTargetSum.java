package dsa.recursion.sumofsubsequences;

import java.util.ArrayList;
import java.util.List;

public class OnlyOneSubSequenceToTargetSum {

	public static boolean printFirstSubsequenceToTargetSum(int index, Integer[] arr, List<Integer> sequence, int targetSum) {
		if(index>arr.length-1) {
			int sum = sequence.stream().mapToInt(Integer::intValue).sum();
			if(sum == targetSum) {
				System.out.println(sequence);
				return true;
			}
			return false;
		}
		
		//Consider current element
		sequence.add(arr[index]);
		if(printFirstSubsequenceToTargetSum(index+1, arr, sequence, targetSum))
			return true;
		
		//Not considering the current element
		sequence.remove(arr[index]);
		if(printFirstSubsequenceToTargetSum(index+1, arr, sequence, targetSum))
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		Integer[] arr = {1,2,1,3,4};
		printFirstSubsequenceToTargetSum(0, arr, new ArrayList<>(), 2);
	}
}
