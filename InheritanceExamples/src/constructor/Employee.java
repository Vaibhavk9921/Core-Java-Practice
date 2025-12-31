package constructor;

public class Employee extends Person {
	private double salary;
	private String year;
	private String insurancenumber;

	public Employee(String name, double salary, String year, String insurancenumber) {
		super(name);
		this.salary = salary;
		this.year = year;
		this.insurancenumber = insurancenumber;
	}

	public double getSalary() {
		return salary;
	}

	public String getYear() {
		return year;
	}

	public String getInsuranceNumber() {
		return insurancenumber;
	}
}
