package twotypeparameter;

class Demo<T, V> {
	T i;
	V j;

	Demo(T x, V y) {
		i = x;
		j = y;
	}

	void show() {
		System.out.println(i);
		System.out.println(i.getClass().getName());
		System.out.println(j);
		System.out.println(j.getClass().getName());
	}
}

public class Test1 {
	public static void main(String[] args) {
		Demo<Integer, String> ob = new Demo(100, "abc");
		ob.show();
	}
}
