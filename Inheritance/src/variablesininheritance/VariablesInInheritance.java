package variablesininheritance;

class A2 {
	int i;

	A2() {
		i = 10;
		System.out.println("In A !!!!");
	}
}

class B2 extends A2 {
	int j;

	B2() {
		j = 20;
		System.out.println("In B !!!");
	}

	void add() {
		System.out.println(i + j);
	}
}

public class VariablesInInheritance {
	public static void main(String[] args) {
		B2 oB = new B2();
		oB.add();
	}
}
