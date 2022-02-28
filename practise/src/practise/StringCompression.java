package practise;

import java.util.Scanner;

public class StringCompression {
	
	public static String compression1(String str){
		// write your code here
		char c = str.charAt(0);
		String newStr = "";
		newStr+=c;
		int count = 1;
		for(int i=1;i<str.length();i++) {
			if(c == str.charAt(i)) {
				count++;
			} else {
				c = str.charAt(i);
				newStr+=c;
				count = 1;
			}
		}
		return newStr;
	}

	public static String compression2(String str){
		// write your code here
		char c = str.charAt(0);
		String newStrComp = "";
		newStrComp+=c;
		int count = 1;
		for(int i=1;i<str.length();i++) {
			if(c == str.charAt(i)) {
				count++;
			} else {
				newStrComp = count > 1?newStrComp+=count:newStrComp;
				c = str.charAt(i);
				newStrComp+=c;
				count = 1;
			}
		}
		newStrComp = count > 1?newStrComp+=count:newStrComp;
		return newStrComp;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}
