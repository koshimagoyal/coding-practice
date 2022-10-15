package assignment;

import java.util.Scanner;

public class AnyBaseToAnyBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sb = sc.nextInt();
		int db = sc.nextInt();
		long sn = sc.nextLong();
		long decimal = 0,temp = sn,count=0,dn=0;
		//anybase to decimal
		while(temp>0) {
			int rem = (int)temp%10;
			decimal = decimal + rem*(long)Math.pow(sb, count);
			count++;
			temp = temp/10;
		}
		//decimal to anybase
		count = 0;
		while(decimal>0) {
			int rem = (int)decimal%db;
			dn = dn + rem*(long)Math.pow(10, count);
			count++;
			decimal = decimal/db;
		}
		System.out.println(dn);
		sc.close();
	}

}
