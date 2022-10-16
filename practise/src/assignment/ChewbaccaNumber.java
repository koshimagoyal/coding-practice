package assignment;

import java.util.Scanner;

public class ChewbaccaNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		long result = 0,place = 1;
		while(n>0) {
			long rem = n%10;
			if(rem>9-rem) {
				if((rem==9)&&(n/10==0)) {
					//do nothing
				} else {
					rem = 9-rem;
				}
			}
			result = result + rem*place;
			n = n/10;
			place *= 10;
		}
		System.out.println(result);
		sc.close();
	}

}
