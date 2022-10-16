package assignment;

import java.util.Scanner;

public class IncreasingDecreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int prev = 0;
		boolean series = true, inc = false;
		while (t > 0) {
			int n = sc.nextInt();
			if (prev == 0) {
				// do nothing
			} else if (inc && prev > n) {
				series = false;
				break;
			} else if (prev == n) {
				series = false;
				break;
			} else if (prev < n) {
				inc = true;
			}
			prev = n;
			t--;
		}
		System.out.println(series);
		sc.close();
	}

}
