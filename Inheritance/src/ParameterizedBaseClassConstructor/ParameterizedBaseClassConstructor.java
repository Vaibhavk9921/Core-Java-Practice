package ParameterizedBaseClassConstructor;

class A3 {
	int i;

	A3(int i) {
		this.i = i;
		System.out.println("In A !!");
	}
}

class B3 extends A3 {
	int j;

	B3(int i) {
		super(i);
		j = 20;
		System.out.println("In B !!!");
	}

	void add() {
		System.out.println(j + super.i);
	}
}

public class ParameterizedBaseClassConstructor {
	public static void main(String[] args) {
		B3 oB = new B3(10);
		oB.add();
	}
}