package highschoolexample;

public class Example {
	public static void main(String[] args) {
		Teacher t1 = new Teacher();
		t1.setName("Agrawal");
		t1.setSalary(123);
		t1.setSubject("MPMC");
		System.out.println(t1.getName());
		System.out.println(t1.getSalary());
		System.out.println(t1.getSubject());
	}
}
