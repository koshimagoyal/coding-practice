package practise;

import java.util.*;
import java.io.*;

public class Pizza {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file;
		try {
			file = new File("C:\\Users\\Lenovo\\Desktop\\a_example");
			FileWriter fw = new FileWriter("C:\\Users\\Lenovo\\Desktop\\output");
			Scanner sc = new Scanner(file);
			while(sc.hasNext()) {
				fw.write(sc.nextLine());
				fw.write("\n");
			}
			System.out.println("Writing Successful");
			fw.close();
			sc.close();
		}catch(FileNotFoundException fe) {
			System.out.println("File not found"+fe);
		}
	}

}
