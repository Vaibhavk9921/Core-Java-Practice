class Test1 {
	{
		System.out.println("Normal Block !!!!");
	}
	static {
		System.out.println("Static Block !!");
	}

	Test1() {
		System.out.println("Constructor Called !!");
	}
}

public class StaticBlock {
	public static void main(String[] args) {
		Test1 test1 = new Test1();
	}
}