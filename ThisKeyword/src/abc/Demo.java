package abc;

class Test {
	int i;

	Test(int i) {
		this.i = i;
	}

	void add() {
		System.out.println(i + i);
	}
}

public class Demo {
	public static void main(String[] args) {
		Test t1 = new Test(10);
		t1.add();
	}
}
