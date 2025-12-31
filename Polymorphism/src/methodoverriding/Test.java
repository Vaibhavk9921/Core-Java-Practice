package methodoverriding;

class Student {
	private int id;
	private String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "[" + id + " " + name + "]";
	}
}

public class Test {
	public static void main(String[] args) {
		Student stud = new Student(100, "abc");
		System.out.println(stud);
		System.out.println(stud.toString());
	}
}