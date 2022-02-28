package practise;

import java.util.Scanner;

public class PrintPermutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		printPermutations(str,"");
	}
	
	public static void printPermutations(String str,String asf) {
		if(str.length() == 0) {
			System.out.println(asf);
			return;
		}
		
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			String first = str.substring(0, i);
			String last = str.substring(i+1);
			String req = first + last;
			printPermutations(req,asf+c);
		}
	}

}
