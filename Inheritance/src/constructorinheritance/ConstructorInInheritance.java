package constructorinheritance;

class A1 extends Object {
	A1() {
		System.out.println("In A !!");
	}
}

class B1 extends A1 {
	B1() {
		System.out.println("In B !!");
	}
}

class C1 extends B1 {
	C1() {
		System.out.println("In C !!");
	}
}

public class ConstructorInInheritance {
	public static void main(String[] args) {
		C1 ob = new C1();
	}
}
