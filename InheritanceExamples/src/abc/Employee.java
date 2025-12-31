package abc;

public class Employee extends Person {
	private double annualsalary;
	private String year;
	private String insurancenumber;

	public double getAnnualSalary() {
		return annualsalary;
	}

	public void setAnnualSalary(double annualsalary) {
		this.annualsalary = annualsalary;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getInsuranceNumber() {
		return insurancenumber;
	}

	public void setInsuranceNumber(String insurancenumber) {
		this.insurancenumber = insurancenumber;
	}
}
