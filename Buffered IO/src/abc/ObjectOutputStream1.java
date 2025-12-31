package abc;

import java.io.*;

class Student implements Serializable {
	private int id;
	private String name;

	public Student() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

public class ObjectOutputStream1 {
	public static void main(String[] args) throws Exception {
		Student s1 = new Student();
		s1.setId(100);
		s1.setName("abc");
		FileOutputStream fout;
		fout = new FileOutputStream("C:\\Users\\Admin\\Desktop\\Demo\\test.txt");
		ObjectOutputStream out;
		out = new ObjectOutputStream(fout);
		out.writeObject(s1);
		out.close();
	}
}