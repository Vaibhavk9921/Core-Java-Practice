package abc;

abstract class A {
	void show() {
		System.out.println("In A");
	}

	abstract void add(int x, int y);
}

class B extends A {
	@Override
	void add(int x, int y) {
		System.out.println(x + y); 
	}
}

public class Demo {
	public static void main(String[] args) {
		B oB = new B();
		oB.show();
		oB.add(100, 200);
	}
}