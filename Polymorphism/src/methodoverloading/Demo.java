package methodoverloading;

class Test {
	void add(int x, int y) {
		System.out.println("Int Called !!");
		System.out.println(x + y);
	}

	void add(float x, float y) {
		System.out.println("Float Called !!");
		System.out.println(x + y);
	}

	void add(String x, String y) {
		System.out.println("String Called !!");
		System.out.println(x + y);
	}
}

public class Demo {
	public static void main(String[] args) {
		Test t1 = new Test();
		t1.add(10, 20);
		t1.add(10.5f, 12.5f);
		t1.add("Vaibhav", "Kadam");
	}
}