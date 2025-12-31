package VariablesInInterface;

interface Test {
	int a = 10;
	static int b = 20;
	final static int c = 30;
	final int d = 40;
}

public class Demo {
	public static void main(String[] args) {
		System.out.println(Test.a);
		System.out.println(Test.b);
		System.out.println(Test.c);
		System.out.println(Test.d);
	}
}
