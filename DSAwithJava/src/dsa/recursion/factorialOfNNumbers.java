package dsa.recursion;

public class factorialOfNNumbers {
	
	public static int factorialByFunctionalWay(int n) {
		if(n == 1) {
			return 1;
		}
		
		return n * factorialByFunctionalWay(n-1);
	}
	
	public static void factorialByParameterizedWay(int n, int factorial) {
		if(n ==1) {
			System.out.println(factorial);
			return;
		}
		
		factorialByParameterizedWay(n-1, (n * factorial));
	}
	
	public static void main(String [] args) {
		int n = 5;
		System.out.println("Factorial by functional recursion: ");
		System.out.println(factorialByFunctionalWay(n));
		System.out.println("Factorial by parameterized way: ");
		factorialByParameterizedWay(n,1);
	}

}
