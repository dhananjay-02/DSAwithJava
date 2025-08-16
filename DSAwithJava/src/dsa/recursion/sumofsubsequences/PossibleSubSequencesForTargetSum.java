package dsa.recursion.sumofsubsequences;

import java.util.ArrayList;
import java.util.List;

public class PossibleSubSequencesForTargetSum {
	
	public static void allSubsequencesWithTargetSum(int index, Integer[] arr, List<Integer> subSequence, int targetSum) {
		if(index > arr.length-1) {
			int sum = subSequence.stream().mapToInt(Integer::intValue).sum();	
			if(targetSum == sum) {					
				System.out.println(subSequence);
			}
			return;
		}
			
		//Include the current element in the subsequence
			subSequence.add(arr[index]);
			allSubsequencesWithTargetSum(index+1, arr, subSequence, targetSum);
			
		// Backtrack: remove the element we just added before exploring the 'exclude' choice
			subSequence.remove(arr[index]);
			
		// Now explore the choice where we do NOT include the current element
			allSubsequencesWithTargetSum(index+1, arr, subSequence, targetSum);
	}
	
	public static void main(String[] args) {
		Integer[] arr = {1,2,1,3,4};
		allSubsequencesWithTargetSum(0, arr, new ArrayList<>(), 3);
	}

}
