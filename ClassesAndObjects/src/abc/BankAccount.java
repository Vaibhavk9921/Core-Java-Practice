package abc;

class Account {
	int id;
	String name;
	float balance;

	void createAccount(int a, String b, float c) {
		id = a;
		name = b;
		balance = c;
	}

	void deposit(int amt) {
		balance += amt;
	}

	void withdraw(int amt) {
		balance -= amt;
	}

	void print() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(balance);
	}
}

public class BankAccount {
	public static void main(String[] args) {
		Account t1 = new Account();
		t1.createAccount(1, "Vaibhav", 10000);
		t1.print();
		t1.deposit(500);
		t1.print();
		Account t2 = new Account();
		t2.createAccount(2, "Vaishnavi", 5000);
		t2.deposit(500);
		t2.print();
	}
}
