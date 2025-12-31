package dowhile;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		String choice;
		do {
			System.out.println("Enter 2 Numbers");
			a = sc.nextInt();
			b = sc.nextInt();
			c = a + b;
			System.out.println("Do You Want to Continue ? (y/n)");
			choice = sc.next();
		} while (choice.equals("y"));
	}
}