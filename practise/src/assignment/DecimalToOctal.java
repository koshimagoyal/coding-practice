package assignment;

import java.util.Scanner;

public class DecimalToOctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int oct = 0,multi=1;
		while(n>0) {
			int rem = n%8;
			oct = oct+rem*multi;
			multi *= 10;
			n = n/8;
		}
		System.out.println(oct);
		sc.close();
	}

}
