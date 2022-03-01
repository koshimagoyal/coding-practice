package practise;

import java.util.Scanner;

public class PowerLog {

	public static void main(String[] args) throws Exception {
        // write your code here
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		System.out.println(power(x,n));
    }

    public static int power(int x, int n){
        if(n==0) {
        	return 1;
        }
        int p = power(x,n/2);
        int ans = p * p;
        if(n%2 != 0) {
        	ans *= x;
        }
        return ans;
    }

}
