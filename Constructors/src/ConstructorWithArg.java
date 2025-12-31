class Test2 {
	int i, j;

	public Test2(int x, int y) {
		i = x;
		j = y;
		System.out.println("Constructor With Arguement Called !! ");
	}

	void add() {
		System.out.println(i + j);
	}
}

public class ConstructorWithArg {
	public static void main(String[] args) {
		Test2 t2 = new Test2(30, 40);
		Test2 t3 = new Test2(10, 20);
		t3.add();
		t2.add();
	}
}