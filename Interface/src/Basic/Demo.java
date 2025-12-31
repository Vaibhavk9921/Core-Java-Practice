package Basic;

interface A {
	void add(int x, int y);

	void sub(int x, int y);
}

class Demo1 implements A {
	@Override
	public void add(int x, int y) {
		System.out.println((x + y));
	}

	public void sub(int x, int y) {
		System.out.println(x - y);
	}
}

public class Demo {
	public static void main(String[] args) {
		Demo1 ob = new Demo1();
		ob.add(100, 200);
		ob.sub(90, 10);
	}
}