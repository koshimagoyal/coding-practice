package practise;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n;i+=2) {
			for(int j=1;j<=n-i;j+=2) {
				System.out.print("\t");
			}
			for(int j=1;j<=i;j+=2) {
				System.out.print("*\t");
			}
			for(int j=1;j<=i-1;j+=2) {
				System.out.print("*\t");
			}
			System.out.println();
		}
		for(int i=n-2;i>=1;i-=2) {
            for(int j=i;j<n;j+=2) {
                System.out.print("\t");
            }
            for(int j=1;j<=i;j+=2) {
				System.out.print("*\t");
            }
            for(int j=i-1;j>=1;j-=2) {
				System.out.print("*\t");
			}
			System.out.println();
		}
	}

}
