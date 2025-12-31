package abc;

abstract class Account {
	void getCustInfo() {
		System.out.println("Get Customer Information !!");
	}

	abstract void calculateInterest();
}

class Saving extends Account {
	@Override
	void calculateInterest() {
		System.out.println("Calculate Interest of Saving !!");
	}
}

class Loan extends Saving {
	@Override
	void calculateInterest() {
		System.out.println("Calculate Interest of Loan ");
	}
}

public class Test {
	public static void main(String[] args) {
		Saving ob1 = new Saving();
		ob1.getCustInfo();
		ob1.calculateInterest();
		Loan ob2 = new Loan();
		ob2.getCustInfo();
		ob2.calculateInterest();
	}
}