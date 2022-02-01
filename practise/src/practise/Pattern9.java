package practise;

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int mid = n/2;
		int np = n-2;
		int sp = mid-1;
		for(int i=0;i<n;i++) {
			if(i<=mid) {
				for(int j=0;j<i;j++) {
					System.out.print("\t");
				}
				System.out.print("*\t");
				for(int j=1;j<=np;j++) {
					System.out.print("\t");
				}
				if(i<mid) {
					System.out.print("*\t");
					np-=2;
				} else {
					np = 1;
				}
			} else {
				for(int j=sp;j>0;j--) {
					System.out.print("\t");
				}
				System.out.print("*\t");
				for(int j=1;j<=np;j++) {
					System.out.print("\t");
				}
				System.out.print("*\t");
				np+=2;
				sp--;
			}
			System.out.println();
		}
	}

}
