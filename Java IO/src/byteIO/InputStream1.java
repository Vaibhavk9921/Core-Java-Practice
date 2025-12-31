package byteIO;
import java.io.*;
public class InputStream1 {
	public static void main(String[] args) throws Exception {
		FileInputStream fin;
		fin = new FileInputStream("C:\\Users\\Admin\\Desktop\\Demo\\test.txt");
		byte[] arr;
		int x;
		do {
			arr = new byte[80];
			x = fin.read(arr);
			String s1 = new String(arr);
			System.out.println(s1);
		} while (x != -1);
		fin.close();
	}
}