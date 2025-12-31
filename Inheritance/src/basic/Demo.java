package basic;

class A {
	void show() {
		System.out.println("In Base !!");
	}
}

class B extends A {
	void Disp() {
		System.out.println("In Derived !!");
	}
}

public class Demo {
	public static void main(String[] args) {
		B ob = new B();
		ob.show();
		ob.Disp();
	}
}
