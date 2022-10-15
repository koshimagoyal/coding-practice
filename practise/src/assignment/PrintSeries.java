package assignment;

import java.util.Scanner;

public class PrintSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int count=1;
		for(int i=1;count<=n1;i++) {
			int term = 3*i+2;
			if(term%n2!=0) {
				System.out.println(term);
				count++;
			}
		}
		sc.close();
	}

}
