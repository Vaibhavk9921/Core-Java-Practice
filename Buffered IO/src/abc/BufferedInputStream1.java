package abc;

import java.io.*;

public class BufferedInputStream1 {
	public static void main(String[] args) throws Exception {
		FileInputStream fin;
		fin = new FileInputStream("C:\\Users\\Admin\\Desktop\\Demo\\test.txt");
		BufferedInputStream bin;
		bin = new BufferedInputStream(fin);
		FileOutputStream fout;
		fout = new FileOutputStream("C:\\Users\\Admin\\Desktop\\Demo\test2.txt", true);
		BufferedOutputStream bout;
		bout = new BufferedOutputStream(fout);
		int x;
		do {
			x = bin.read();
			if (x != -1) {
				bout.write(x);
			}
		} while (x != -1);
		bout.flush();
		bout.close();
		bin.close();
	}
}