package methodoverloading;

class A {
	void add(int x, int y) {
		System.out.println("In A");
		System.out.println(x + y);
	}
}

class B extends A {
	void add(double x, double y) {
		System.out.println("in B !!");
		System.out.println(x + y);
	}
}

public class Inheritance {
	public static void main(String[] args) {
		B oB = new B();
		oB.add(10, 20);
		oB.add(1.2, 2.3);
	}
}
