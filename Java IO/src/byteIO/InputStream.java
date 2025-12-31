package byteIO;
import java.io.*;

public class InputStream {
	public static void main(String[] args) throws Exception {
		FileInputStream fin;
//      Relative Path
//		fin = new FileInputStream("test.txt");
//      Physical Path
		fin = new FileInputStream("C:\\Users\\Admin\\Desktop\\Demo\\test.txt");
		int x;
		do {
			x = fin.read();
			System.out.println((char) x);
		} while (x != -1);
		fin.close();
	}
}