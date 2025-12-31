import java.io.*;

public class ListOfFiles {
	public static void main(String[] args) throws Exception {
		File f = new File("C:\\Users\\Admin\\Desktop\\Demo");
		String[] arr = f.list();
		for (String file : arr) {
			System.out.println(file);
		}
		File[] arr1 = f.listFiles();
		for (File file : arr1) {
			if (file.isFile()) {
				System.out.println("File " + file.getName());
			} else {
				System.out.println("Dir :" + file.getName());
			}
		}
	}
}