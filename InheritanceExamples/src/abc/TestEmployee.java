package abc;

public class TestEmployee {
	public static void main(String[] args) {
		Employee el = new Employee();
		el.setName("abc");
		el.setAnnualSalary(123);
		el.setInsuranceNumber("AB");
		el.setYear("2025");
		System.out.println(el.getName());
		System.out.println(el.getYear());
		System.out.println(el.getAnnualSalary());
		System.out.println(el.getInsuranceNumber()); 
	}
}
