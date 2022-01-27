package practise;
import java.util.*;

public class GradingSystem {

	public static void main(String[] args) {
		// Write your code here
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        if(no>90) {
            System.out.println("excellent");
        } else if(no>80 && no<=90) {
            System.out.println("good");
        } else if(no>70 && no<=80) {
            System.out.println("fair");
        } else if(no>60 && no<=70) {
            System.out.println("meets expectations");
        } else {
            System.out.println("below par");
        }
	}

}
