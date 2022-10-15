package assignment;

import java.util.Scanner;

public class SimpleInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while(sc.hasNext()) {
			int n=sc.nextInt();
			sum+=n;
			if(sum<0) {
				break;
			} else {
				System.out.println(n);
			}
		}
		sc.close();
	}

}
