package assignment;

import java.util.Scanner;

public class PrintPrimes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		for(int i=1;i<=no;i++) {
			int count = 0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(i);
			}
		}
		sc.close();
	}

}
