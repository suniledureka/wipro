package comm.wipro.testing.utils;

public class Palindrome {
	public boolean isPalindrome(String str) {
		str = str.toLowerCase();
		
		for(int start=0, end=str.length()-1; start <= end; start++, end--) {
			if(str.charAt(start) != str.charAt(end)) {
				return false;
			}
		}
		return true;
	}
}
