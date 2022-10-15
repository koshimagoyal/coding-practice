package assignment;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int decimal = 0,count=0;
		while(n>0) {
			int rem = n%10;
			decimal = decimal + rem*(int)Math.pow(2, count);
			count++;
			n = n/10;
		}
		System.out.println(decimal);
		sc.close();
	}

}
