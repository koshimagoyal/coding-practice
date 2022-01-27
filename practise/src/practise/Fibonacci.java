package practise;
import java.util.*;

public class Fibonacci {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	      int n = sc.nextInt();
	      int a = 0;
	      int b = 1;
	      int sum = a+b;
	      System.out.println(a);
	      System.out.println(b);
	      for(int i=2;i<n;i++) {
	          System.out.println(sum);
	          a = b;
	          b = sum;
	          sum = a+b;
	      }
	}

}
