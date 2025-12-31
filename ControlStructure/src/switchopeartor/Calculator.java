package switchopeartor;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		int a, b, c;
		String choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number :");
		b = sc.nextInt();
		System.out.println("Enter 2nd Number");
		c = sc.nextInt();
		System.out.println("Enter Operation to Perform(+,-,*,/,%)");
		choice = sc.next();
		switch (choice) {
		case "+":
			a = b + c;
			System.out.println("Addition is " + a);
			break;
		case "-":
			a = b - c;
			System.out.println("Substraction is " + a);
			break;
		case "*":
			a = b * c;
			System.out.println("Multiplication is " + a);
			break;
		case "/":
			a = b / c;
			System.out.println("Division is " + a);
			break;
		case "%":
			if (b > c) {
				a = b % c;
				System.out.println("Remainder is " + a);
			} else {
				a = c % b;
				System.out.println("Remainder is " + a);
			}
			break;
		default:
			System.out.println("Wrong Choice ");
		}

	}
}
