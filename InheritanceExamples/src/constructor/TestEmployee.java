package constructor;

public class TestEmployee {
	public static void main(String[] args) {
		Employee el = new Employee("Vaibhav", 123, "2025", "ABC");
		System.out.println("Name: " + el.getName());
		System.out.println("Joining Year: " + el.getYear());
		System.out.println("Salary: " + el.getSalary());
		System.out.println("Insurance Number: " + el.getInsuranceNumber());
	}
}