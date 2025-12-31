package abc;

import java.io.*;

public class Demo {
	public static void main(String[] args) throws Exception {
		RandomAccessFile f;
		f = new RandomAccessFile("C:\\Users\\Admin\\Desktop\\Demo\\test.txt", "r");
		f.seek(2);
		int x;
		do {
			x = f.read();
			System.out.println((char) x);
		} while (x != -1);
		f.close();
	}
}