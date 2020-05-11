package io.javabrains;
import java.lang.*;

public class MathUtils {
	public boolean checkPalindrome(String input) {
		if(input==null)
		{
		throw new IllegalArgumentException("Input is null");
		}
	/*	char ch[]=input.toCharArray();
		String rev="";
		for(int i=ch.length-1;i>=0;i--){
			rev+=ch[i];
		}*/
		if (input.equals(reverse(input))) {
			return true;
		} else {
			return false;
		}
	}
	private String reverse(String input) {
		String rev = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			rev = rev + input.charAt(i);
		}
		return rev;
	}
}
