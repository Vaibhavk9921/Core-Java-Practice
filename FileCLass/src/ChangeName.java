import java.io.*;

public class ChangeName {
	public static void main(String[] args) throws Exception {
		// File Rename

		File f = new File("C:\\Users\\Admin\\Desktop\\Demo\\test4.txt");
		File f2 = new File("C:\\Users\\Admin\\Desktop\\Demo\\test2.txt");
		f.renameTo(f2);
		// Folder Rename
//		File f1 = new File("C:\\Users\\Admin\\Desktop\\Demo\\myfolder");
//		File f3 = new File("C:\\Users\\Admin\\Desktop\\Demo\\myfolder1");
//		f1.renameTo(f3);
	}
}