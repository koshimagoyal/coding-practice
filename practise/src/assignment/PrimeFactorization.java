package assignment;

import java.util.Scanner;

public class PrimeFactorization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			int count = 0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				while(n%i==0) {
					n=n/i;
					System.out.print(i+" ");
				}
			}
		}
		sc.close();
	}

}
