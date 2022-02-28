package practise;

import java.util.Scanner;

public class StringDifference {

	public static String solution(String str){
		// write your code here
		char c = str.charAt(0);
		String newStr = "";
		newStr+=c;
		for(int i=1;i<str.length();i++) {
			int diff = str.charAt(i) - c;
			newStr+=diff;
			newStr+=str.charAt(i);
			c = str.charAt(i);
		}
		return newStr;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}

}
