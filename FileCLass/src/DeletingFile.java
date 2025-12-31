import java.io.*;

public class DeletingFile {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\Admin\\Desktop\\Demo\\test2.txt");
		f.delete();
		File f1 = new File("C:\\Users\\Admin\\Desktop\\Demo\\myfolder2");
		f1.delete();
	}
}
