package MultipleInterfaces;

interface A {
	void add(int x, int y);
}

interface B {
	void sub(int x, int y);
}

class Demo implements A, B {
	@Override
	public void add(int x, int y) {
		System.out.println((x + y));
	}

	@Override
	public void sub(int x, int y) {
		System.out.println((x - y));
	}
}

public class Test1 {
	public static void main(String[] args) {
		Demo ob1 = new Demo();
		ob1.add(100, 200);
		ob1.sub(200, 100);
	}
}