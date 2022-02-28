package practise;

import java.util.Scanner;

public class PrintAllPalindrome {

	public static void printPalindrome(String str) {
		int n = str.length();
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<=n;j++) {
				String str1 = str.substring(i,j);
				if(isPalindrome(str1)) {
					System.out.println(str1);
				}
			}
		}
	}
	public static boolean isPalindrome(String str) {
		int n = str.length();
		int left = 0;
		int right = n-1;
		while(left<=right) {
			char ch1 = str.charAt(left);
			char ch2 = str.charAt(right);
			if(ch1 == ch2) {
				left++;
				right--;
			} else {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		printPalindrome(str);
	}

}
