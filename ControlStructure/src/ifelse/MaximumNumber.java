package ifelse;

import java.util.Scanner;

public class MaximumNumber {
	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		a = sc.nextInt();
		System.out.println("Enter Second Number");
		b = sc.nextInt();
		if (a > b) {
			System.out.println("First Number Is Max");
		} else {
			System.out.println("Second Number Is Max");
		}
	}
}
