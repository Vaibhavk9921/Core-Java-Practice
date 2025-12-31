package Difference;

import java.io.*;

public class Test2 {
	public static void main(String[] args) throws Exception {
		FileReader fin = new FileReader("C:\\Users\\Admin\\Desktop\\Demo\\test.txt");
		BufferedReader bin = new BufferedReader(fin);
		FileWriter fout = new FileWriter("C:\\Users\\Admin\\Desktop\\Demo\\test4.txt");
		BufferedWriter bout = new BufferedWriter(fout);
		String s1;
		while ((s1 = bin.readLine()) != null) {
			bout.write(s1);
			bout.newLine();
		}
		bin.close();
		bout.close();
	}
}