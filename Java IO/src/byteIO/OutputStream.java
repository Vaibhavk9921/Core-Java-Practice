package byteIO;

import java.io.*;

public class OutputStream {
	public static void main(String[] args) throws Exception {
		FileInputStream fin;
		fin = new FileInputStream("C:\\Users\\Admin\\Desktop\\Demo\\test.txt");
		FileOutputStream fout;
		fout = new FileOutputStream("C:\\Users\\Admin\\Desktop\\Demo\\test.txt");
		int x;
		do {
			x = fin.read();
			if (x != -1) {
				fout.write(x);
			}
		} while (x != -1);
		fin.close();
		fout.close();
	}
}