class Test3 {
	int i, j;

	Test3() {
		i = 10;
		j = 20;
		System.out.println("Constructor Without Arguement");
	}

	Test3(int x, int y) {
		i = x;
		j = y;
		System.out.println("Constructor With Arguement");
	}

	void add() {
		System.out.println(i + j);
	}

}

public class ConstructorOverloading {
	public static void main(String[] args) {
		Test3 t3 = new Test3();
		Test3 t4 = new Test3(30, 40);
		t3.add();
		t4.add(); 
	}
}
