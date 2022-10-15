package assignment;

import java.util.Scanner;

public class ShoppingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0) {
			int aPur = sc.nextInt();
			int hPur = sc.nextInt();
			int count = 0,sumA=0,sumB=0;
			while(sumA<=aPur&&sumB<=hPur) {
				count++;
				if(count%2==0) {
					sumB++;
				} else {
					sumA++;
				}
			}
			if(sumA>aPur) {
				System.out.println("Harshit");
			} else {
				System.out.println("Aayush");
			}
			t--;
		}
		sc.close();
	}

}
