class Test implements Runnable {
	Thread t;

	public Test() {
		t = new Thread(this);
		t.start();
	}

	@Override
	public void run() {
		try {
			int i;
			for (i = 1; i <= 4; i++) {
				System.out.println("In Demo :" + i);
				Thread.sleep(500);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

public class Demo {
	public static void main(String[] args) throws Exception {
		int i;
		for (i = 1; i <= 4; i++) {
			System.out.println("In Test" + i);
			Thread.sleep(1000);
		}
		Test t = new Test();
		t.run();
	}
}
