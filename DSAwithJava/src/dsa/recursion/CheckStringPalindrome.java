package dsa.recursion;

public class CheckStringPalindrome {
	
	public static boolean checkPalindrome(int ptr, String str) {
		if(ptr >= str.length() -1)
			return true;
		if(str.charAt(ptr) == str.charAt(str.length()-1-ptr)) {			
			return checkPalindrome(ptr+1,str);
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		String str = "madam";
		System.out.println(checkPalindrome(0,str));
	}
}
