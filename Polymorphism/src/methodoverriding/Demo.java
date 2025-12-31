package methodoverriding;

class A {
	void show() {
		System.out.println("In A !!");
	}
}

class B extends A {
	void show() {
		System.out.println("In B !!");
	}
}

public class Demo {
	public static void main(String[] args) {
		B oB = new B();
		oB.show();
	}
}
