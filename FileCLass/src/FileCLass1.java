

import java.io.*;
import java.sql.Date;

public class FileCLass1 {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\Admin\\Desktop\\Demo\\test.txt");
		System.out.println(f.getName());
		System.out.println(f.length());
		System.out.println(f.getParent());
		long x = f.lastModified();
		Date d = new Date(x);
		System.out.println(d);
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
	}
}