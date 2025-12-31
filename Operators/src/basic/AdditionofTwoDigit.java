package basic;

import java.util.Scanner;

public class AdditionofTwoDigit {
	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Number");
		a = sc.nextInt();
		b = a / 10;
		c = a % 10;
		a = b + c;
		System.out.println("Addition is " + a);
	}
}
