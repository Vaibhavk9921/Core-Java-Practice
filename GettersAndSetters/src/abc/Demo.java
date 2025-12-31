package abc;

class Student {
	private int id;
	private String name;

	int getId() {
		return id;
	}

	void setId(int x) {
		id = x;
	}

	String getName() {
		return name;
	}

	void setName(String n) {
		name = n;
	}
}

public class Demo {
	public static void main(String[] args) {
		Student st = new Student();
		st.setId(100);
		st.setName("Vaibhav");
		int x = st.getId();
		String a = st.getName();
		System.out.println(x);
		System.out.println(a);
	}
}
