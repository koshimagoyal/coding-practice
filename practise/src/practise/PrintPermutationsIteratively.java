package practise;

import java.util.Scanner;

public class PrintPermutationsIteratively {

	public static void printPermutations(String str) {
		int fact = factorial(str.length());
		int n = str.length();
		for(int i=0;i<fact;i++) {
			StringBuilder rep = new StringBuilder(str);
			int temp = i;
			for(int div=n;div>=1;div--) {
				int q = temp/div;
				int rem = temp%div;
				
				System.out.print(rep.charAt(rem));
				rep.deleteCharAt(rem);
				
				temp = q;
			}
			System.out.println();
		}
	}
	public static int factorial(int n) {
		int fact = 1;
		for(int i=2;i<=n;i++) {
			fact*=i;
		}
		return fact;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		printPermutations(str);

	}

}
