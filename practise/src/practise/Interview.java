package practise;
import java.util.*;


public class Interview {
	
	public static void main(String args[]) {
		List<String> list = new ArrayList<>();
		list.add("abc");
		list.add("def");
		list.stream().forEach(str -> System.out.println(str.charAt(0)));
		
		Singleton x = Singleton.getInstance();
		Singleton y = Singleton.getInstance();
		System.out.println(x.s);
		System.out.println(y.s);
		System.out.println(x==y);
	}

}
