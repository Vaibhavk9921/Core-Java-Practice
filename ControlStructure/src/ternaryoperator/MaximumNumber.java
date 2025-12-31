package ternaryoperator;

import java.util.Scanner;

public class MaximumNumber {
	public static void main(String[] args) {
		int a, b, max;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Number");
		a = sc.nextInt();
		System.out.println("Enter 2nd Number");
		b = sc.nextInt();
		// Ternary Operator
		max = a > b ? a : b;
		System.out.println("Maximum Number is :" + max);
	}
}
