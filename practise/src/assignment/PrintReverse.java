package assignment;

import java.util.Scanner;

public class PrintReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long rev = 0;
		while(n>0) {
			long rem = n%10;
			rev = rev*10+rem;
			n = n/10;
		}
		System.out.println(rev);
		sc.close();
	}

}
