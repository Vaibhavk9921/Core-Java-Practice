class Gmail implements Runnable {
	String uname;
	Thread t;

	public Gmail(String n) {
		uname = n;
		t = new Thread(this);
		t.setName(n);
		t.start();
	}

	@Override
	public void run() {
		try {
			System.out.println("Logging in for :" + t.getName());
			Thread.sleep(5000);
			System.out.println("Logging in For " + t.getName());
		} catch (Exception e) {
		}
	}
}

public class MultipleThreads {
	public static void main(String[] args) {
		Gmail ob1 = new Gmail("Atharva");
		Gmail ob2 = new Gmail("Sagar");
		Gmail ob3 = new Gmail("Rohit");
		Gmail ob4 = new Gmail("Vaibhav");
		Gmail ob5 = new Gmail("Sumit");
	}
}
