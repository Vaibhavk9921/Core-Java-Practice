package switchopeartor;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Number");
		x = sc.nextInt();
		switch (x) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		default:
			System.out.println("Wrong Choice");
		}
	}
}
