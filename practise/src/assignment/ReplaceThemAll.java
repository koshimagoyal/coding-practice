package assignment;

import java.util.Scanner;

public class ReplaceThemAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		if(n==0) {
			System.out.println(5);
		} else {
			long temp = 0;
			while(n>0) {
				long rem = n%10;
				if(rem == 0) {
					temp = temp*10+5;
				} else {
					temp = temp*10+rem;
				}
				n = n/10;
			}
			//or could be temp = temp+rem*Math.pow(10,count)
			n = 0;
			while(temp>0) {
				long rem = temp%10;
				n = n*10+rem;
				temp = temp/10;
			}
			System.out.println(n);
		}
		sc.close();
	}

}
