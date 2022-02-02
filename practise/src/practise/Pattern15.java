package practise;

import java.util.Scanner;

public class Pattern15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sp = n/2;
		int st = 1;
		int no = 1;
		int k = sp;
		for(int i=1;i<=n;i++) {
			if(i<=sp+1) {
				for(int j=1;j<=sp-i+1;j++) {
					System.out.print("\t");
				}
				no = i;
				for(int j=1;j<=st;j++) {
					System.out.print(no+"\t");
					if(j>=i) {
						no--;
					} else {
						no++;
					}
				}
			} else {
				for(int j=1;j<=i-sp-1;j++) {
					System.out.print("\t");
				}
				for(int j=1;j<=st;j++) {
					System.out.print(no+"\t");
					if(j>=k) {
						no--;
					} else {
						no++;
					}
				}
				k--;
			}
			if(i<=n/2) {
				st+=2;
			} else {
				st-=2;
			}
			System.out.println();
		}
	}

}
