package interfaceinheritance;

interface A1 {
	void add(int x, int y);
}

interface B1 extends A1 {
	abstract void sub(int x, int y);
}

class Demo2 implements B1 {
	@Override
	public void add(int x, int y) {
		System.out.println(x + y);
	}

	@Override
	public void sub(int x, int y) {
		System.out.println(x - y);
	}
}

public class InterfaceInheritance {
	public static void main(String[] args) {
		Demo2 ob = new Demo2();
		ob.add(10, 20);
		ob.sub(200, 100);
	}
}
