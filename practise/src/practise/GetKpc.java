package practise;

import java.util.*;

public class GetKpc {
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(getKPC(str));
    }

	public static String codes[] = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static ArrayList<String> getKPC(String str) {
    	if(str.length() == 0) {
    		ArrayList<String> result = new ArrayList<>();
    		result.add("");
    		return result;
    	}
    	String code = codes[str.charAt(0) - '0'];
    	String sub = str.substring(1);
    	ArrayList<String> list = getKPC(sub);
    	ArrayList<String> result = new ArrayList<>();
    	for(int i=0;i<code.length();i++) {
    		char c = code.charAt(i);
    		for(int j=0;j<list.size();j++) {
    			result.add(c+list.get(j));
    		}
    	}
        return result;
    }
	
}
