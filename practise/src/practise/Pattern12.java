package practise;

import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = 0,a=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if(i==1) {
					System.out.print(k+"\t");
					k = a+k;
				} else {
					System.out.print(k+"\t");
					int c = a+k;
					k = a;
					a = c;
				}
			}
			System.out.println();
		}
	}

}
