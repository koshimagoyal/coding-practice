package practise;

public class Singleton {

	private static Singleton obj = null;
	public String s;
	
	Singleton() {
		s = "I am object1";
	}
	
	public static Singleton getInstance() {
		if(obj == null) {
			obj = new Singleton();
		}
		return obj;
	}

}
