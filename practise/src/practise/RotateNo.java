package practise;
import java.util.*;

public class RotateNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      int n = sc.nextInt();
	      int k = sc.nextInt();
	      int count = 0;
	      int temp = n;
	      while(temp>0) {
	        temp = temp / 10;
	        count++;
	      }
	      k = k%count;
	      if(k<0) {
	        k = count + k;
	      }
	      int div = 1;
	      int mul = 1;
	      for(int i=1;i<=count;i++) {
	        if(i<=k) {
	          div = div*10;
	        } else {
	          mul = mul*10;
	        }
	      }
	      int rotNo = n%div;
	      int newNo = (rotNo*mul) +(n/div);
	      System.out.println(newNo);
	}

}
