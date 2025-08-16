package dsa.recursion;

import java.util.ArrayList;
import java.util.List;

public class PossibleSubSequences {

	public static void printSubsequences(Integer index,Integer[] arr, List<Integer> subSequence) {
		if(index>arr.length-1) {
			System.out.println(subSequence);
			return;
		}
		
		//pick the current and print the related subsequence.
		subSequence.add(arr[index]);
		printSubsequences(index+1, arr, subSequence);
		subSequence.remove(arr[index]);
		
		//don't pick the current one.
		printSubsequences(index+1, arr, subSequence);
	}
	
	public static void main(String[] args) {
		Integer[] arr = {1,2,3,4};
		printSubsequences(0, arr, new ArrayList<>());
	}
}
