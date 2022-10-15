package assignment;

import java.util.Scanner;

public class MakeDigit1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		long digit = 0,count=0;
		while(t>0) {
			long n = sc.nextInt();
			digit = n*(long)Math.pow(10, count)+digit;
			count++;
			t--;
		}
		System.out.println(digit);
		sc.close();
	}

}
