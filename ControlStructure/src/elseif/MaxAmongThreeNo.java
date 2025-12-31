package elseif;

import java.util.Scanner;

public class MaxAmongThreeNo {
	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		a = sc.nextInt();
		System.out.println("Enter Second Number");
		b = sc.nextInt();
		System.out.println("Enter Third Number");
		c = sc.nextInt();
		if (a > b && a > c) {
			System.out.println("First Number is Max");
		} else if (b > c && b > a) {
			System.out.println("Second Number is Max ");
		} else {
			System.out.println("Third Number is Max");
		}
	}
}
