package practise;

import java.util.Scanner;

public class ToggleCase {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}

	public static String toggleCase(String str) {
		String newStr = "";
		for(int i=0;i<str.length();i++) {
			if(Character.isLowerCase(str.charAt(i))) {
				newStr += Character.toUpperCase(str.charAt(i));
			} else {
				newStr += Character.toLowerCase(str.charAt(i));
			}
		}
		return newStr;
	}

}
