package practise;
import java.util.*;

public class NumberPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      int t = sc.nextInt();
	      while(t>0) {
	        int n = sc.nextInt();
	        int count = 0;
	        for(int i=2;i*i<=n;i++) {
	          if(n%i==0) {
	            count++;
	            break;
	          }
	        }
	        if(count==0) {
	          System.out.println("prime");
	        } else {
	          System.out.println("not prime");
	        }
	        t--;
	      }
	}

}
