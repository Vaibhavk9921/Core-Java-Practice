package abc;

class Test1 {
	int i;
	static int j;

	Test1() {
		i++;
		j++;
	}

	void show() {
		System.out.println(i);
		System.out.println(j);
	}
}

public class StaticVariable {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		Test1 t2 = new Test1();
		Test1 t3 = new Test1();
		t1.show();
		t2.show();
		t3.show();
	}
}
