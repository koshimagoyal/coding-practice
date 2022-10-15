package assignment;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String no = sc.next();
		int digit = sc.nextInt();
		int count=0;
		for(Character c:no.toCharArray()) {
			if((c-'0')==digit) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}

}
