package runtimepolymorphism;

class A {
	void read() {
		System.out.println("Read from HDD");
	}
}

class B extends A {
	void read() {
		System.out.println("Read from USB");
	}
}

class C extends B {
	void read() {
		System.out.println("Read from Network");
	}
}

public class Demo {
	public static void main(String[] args) {
		A ob1 = new A();
		B ob2 = new B();
		C ob3 = new C();
		A r;
		r = ob2;
		r.read();
		r = ob1;
		r.read();
		r = ob3;
		r.read();
	}
}
