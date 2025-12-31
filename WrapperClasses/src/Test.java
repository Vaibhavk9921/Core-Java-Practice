
public class Test {
	public static void main(String[] args) {
		// Boxing
		int x = 100;
		Integer ob = new Integer(x);
		// Unboxing
		int y;
		y = ob.intValue();
		System.out.println(y);

		// Autoboxing
		int a = 100;
		Integer ob1 = a;

		// Autounboxing
		int z;
		z = ob1;
		System.out.println(z);
	}
}