package abc;

class Demo1 {
	int i, j;

	void setij(int x, int y) {
		i = x;
		j = y;
	}

	void add() {
		System.out.println(i + j);
	}
}

public class RefferenceVariable {
	public static void main(String[] args) {
		Demo1 d1 = new Demo1();
		Demo1 d2 = null;
		d1.setij(10, 20);
		d2 = d1;
		d2.setij(30, 40);
		d1.add();
		d2.add();
	}
}
