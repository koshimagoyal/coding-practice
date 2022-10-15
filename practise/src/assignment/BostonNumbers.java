package assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class BostonNumbers {
	
	public static int getDigitsSum(int no) {
		int temp = no,digitSum=0;
		while(temp>0) {
			int digit = temp%10;
			digitSum+=digit;
			temp = temp/10;
		}
		return digitSum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		int sum = 0,temp=no,digitSum=0;
		boolean flag = false;
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=2;i*i<temp;i++) {
			if(temp%i==0) {
				flag = true;
				break;
			}
		}
		if(flag) {
			for(int i=2;i*i<=temp;i++) {
				while(temp%i==0) {
					temp=temp/i;
					list.add(i);
				}
			}
			if(temp!=1) {
				list.add(temp);
			}
			digitSum = getDigitsSum(no);
			if(list.size()!=0) {
				for(Integer i:list) {
					int factorDigitSum = 0;
					if(i>=10) {
						factorDigitSum = getDigitsSum(i);
						sum+=factorDigitSum;
					} else {
						sum+=i;
					}
				}
			}
		}
		if(sum==digitSum) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		sc.close();
	}

}
