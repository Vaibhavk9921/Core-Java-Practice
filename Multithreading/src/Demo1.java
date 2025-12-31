class Test1 implements Runnable {
	Thread t;
	String uname;

	public Test1(String n) {
		uname = n;
		t = new Thread(this);
		t.setName(n);
		t.start();
	}

	@Override
	public void run() {
		try {
			System.out.println("Logging for :" + t.getName());
			Thread.sleep(5000);
			System.out.println("Logging for :" + t.getName());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

public class Demo1 {
	public static void main(String[] args) {
		Test1 ob1 = new Test1("Atharva");
		Test1 ob2 = new Test1("Sagar");
		Test1 ob3 = new Test1("Rohit");
		Test1 ob4 = new Test1("Sumit");
		System.out.println("Thread1 isAlive " + ob1.t.isAlive());
		System.out.println("Thread2 isAlive " + ob2.t.isAlive());
		System.out.println("Thread3 isAlive " + ob3.t.isAlive());
		System.out.println("Thread4 isAlive " + ob4.t.isAlive());
	}
}
