package assignment;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0) {
			int n = sc.nextInt();
			int sum1 = 0, sum2 = 0,count = 1;
			while(n>0) {
				int rem = n%10;
				if(count%2!=0) {
					sum1+=rem;
				} else {
					sum2+=rem;
				}
				n = n/10;
				count++;
			}
			if ((sum1 % 2 == 0&&sum1% 4 == 0) || (sum2 % 2 !=0 &&sum2 % 3 == 0)) {
				System.out.println("Yes");
			} else if((sum2 % 2 == 0&&sum2% 4 == 0) || (sum1 % 2 !=0 &&sum1 % 3 == 0)){
				System.out.println("Yes");
			} else{
				System.out.println("No");
			}
			t--;
		}
		sc.close();
	}

}
