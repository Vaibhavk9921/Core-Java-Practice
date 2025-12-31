package abc;

import java.io.*;

public class ObjectInputStream1 {
	public static void main(String[] args) throws Exception {
		FileInputStream fin;
		fin = new FileInputStream("C:\\Users\\Admin\\Desktop\\Demo\\test.txt");
		ObjectInputStream in;
		in = new ObjectInputStream(fin);
		Student s2;
		s2 = (Student) in.readObject();
		System.out.println(s2.getId());
		System.out.println(s2.getName());
		in.close();
	}
}