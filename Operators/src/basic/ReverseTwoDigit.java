package basic;

import java.util.Scanner;

public class ReverseTwoDigit {
	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		a = sc.nextInt();
		b = a / 10;
		c = a % 10;
		a = b + c * 10;
		System.out.println("Reverse Number is " + a);
	}
}