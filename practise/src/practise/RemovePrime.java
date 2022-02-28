package practise;

import java.util.ArrayList;
import java.util.Scanner;

public class RemovePrime {

	public static boolean isPrime(int n) {
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void solution(ArrayList<Integer> al){
		// write your code here
		for(int i=0;i<al.size();) {
			if(isPrime(al.get(i))) {
				al.remove(i);
			} else {
				i++;
			}
		}
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0 ; i < n; i++){
			al.add(scn.nextInt());
		}
		solution(al);
		System.out.println(al);
	}

}
