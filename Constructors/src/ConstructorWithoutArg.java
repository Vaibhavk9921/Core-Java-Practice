
class Test1 {
	int i, j;

	Test1() {
		i = 10;
		j = 20;
		System.out.println("Constructor Called !!");
	}

	void add() {
		System.out.println(i + j);
	}
}

public class ConstructorWithoutArg {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t1.add();
	}
}
