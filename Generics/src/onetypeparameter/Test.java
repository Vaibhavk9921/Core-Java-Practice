package onetypeparameter;

class Demo<T> {
	T i;

	Demo(T x) {
		i = x;
	}

	void show() {
		System.out.println(i);
		System.out.println(i.getClass().getName());
	}
}

public class Test {
	public static void main(String[] args) {
		Demo<Integer> ob1 = new Demo(100);
		Demo<Integer> ob2 = new Demo("ABC");
		ob1.show();
		ob1.show(); 
	}
}
