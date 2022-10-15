package assignment;

import java.util.Scanner;

public class IncreasingDecreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		boolean series=false,inc=false,dec=false;
		int prev = 0;
		while(t>0) {
			int n = sc.nextInt();
			if(!inc&&!dec) {
				if (prev == 0) {
					prev = n;
				} else if (prev != n && prev < n) {
					prev = n;
					inc = true;
					dec = false;
				} else if (prev != n && prev > n) {
					prev = n;
					inc = false;
					dec = true;
				}
			} else {
				if(inc&&prev<n) {
					series = true;
				} else if(dec&&prev>n) {
					series = true;
				} else {
					series = false;
					break;
				}
				prev = n;
			}
			t--;
		}
		System.out.println(series);
		sc.close();
	}

}
