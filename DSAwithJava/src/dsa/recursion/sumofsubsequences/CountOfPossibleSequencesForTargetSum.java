package dsa.recursion.sumofsubsequences;

public class CountOfPossibleSequencesForTargetSum {

	public static int countPossibleSequences(int index, Integer[] arr,int sum, int targetsum) {
		
		if(sum>targetsum)
			return 0;
		if(index>arr.length-1) {
			if(sum == targetsum) {
				return 1;
			}
			return 0;
		}
		
		sum+=arr[index];
		int l = countPossibleSequences(index+1, arr, sum, targetsum);
		sum-=arr[index];
		int r = countPossibleSequences(index+1, arr,sum, targetsum);
		
		return l+r;
	}
	
	public static void main(String [] args) {
		Integer[] arr = {1,1,2};
		System.out.println(countPossibleSequences(0,arr,0, 3));
	}
}
