package assignment;

import java.util.Scanner;

public class ReplaceThemAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = 0;
		while(n>0) {
			int rem = n%10;
			if(rem == 0) {
				temp = temp*10+5;
			} else {
				temp = temp*10+rem;
			}
			n = n/10;
		}
		n = 0;
		while(temp>0) {
			int rem = temp%10;
			n = n*10+rem;
			temp = temp/10;
		}
		System.out.println(n);
		sc.close();
	}

}
