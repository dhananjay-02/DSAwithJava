package dsa.recursion;

public class ReverseArrayUsingRecursion {
	
	public static int[] reverseArray(int startPtr, int endPtr, int[] array) {

		if (endPtr < startPtr)
			return array;
		swapElements(array, startPtr, endPtr);
		return reverseArray(startPtr + 1, endPtr - 1, array);
		
		/*
		 * //For one variable swapping
		 *  if(startPtr >= (array.length/2)) 
		 *  	return array;
		 * swapWithOneVariable(startPtr,array); 
		 * return reverseArray(startPtr+1,0,array);
		 */
		    
	}
	
	public static void swapElements(int[] array, int startPtr, int endPtr) {
		int temp = array[startPtr];
		array[startPtr] = array[endPtr];
		array[endPtr]= temp;
	}
	
	public static void swapWithOneVariable(int startPtr, int[]arr) { /*(arr.length-1) - startPtr  ==> rightElement*/
		int temp = arr[startPtr];
		arr[startPtr] = arr[(arr.length-1) - startPtr];
		arr[(arr.length-1) - startPtr] = temp;
	}
	
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5};
		reverseArray(0,arr.length-1,arr);
		for(int a : arr) {			
			System.out.println(a);
		}
	}

}
