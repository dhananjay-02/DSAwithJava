package dsa.sorting;

import java.util.ArrayList;
import java.util.List;

public class MergSortRecursion {
	
	public static void divide(int[]arr, int startIndex, int endIndex) {
		if(startIndex>=endIndex)
			return;
		int midIndex = (startIndex+endIndex)/2;
		divide(arr,startIndex,midIndex);
		divide(arr, midIndex+1, endIndex);
		
		merge(arr, startIndex, endIndex, midIndex);
	}
	
	public static void merge(int[]arr, int startIndex, int endIndex, int midIndex) {
		int left = startIndex;
		int right = midIndex+1;
		List<Integer> temp = new ArrayList<Integer>(endIndex);
		while(left<=midIndex && right<=endIndex) {
			if(arr[left] <= arr[right]) {
				temp.add(arr[left]);
				left++;
			}else {
				temp.add(arr[right]);
				right++;
			}
		}
		
		while(left<=midIndex) {
			temp.add(arr[left]);
			left++;
		}
		
		while(right<=endIndex) {
			temp.add(arr[right]);
			right++;
		}
		
		for(int i = startIndex; i<=endIndex;i++) {
			arr[i] = temp.get(i-startIndex);
		}
	}
	public static void main(String[] args) {
		int[] arr = {3,2,4,1};
		divide(arr, 0, arr.length-1);
		
		for(int i: arr) {
			System.out.println(i);
		}
	}

}
