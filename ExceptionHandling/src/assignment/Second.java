package assignment;

import java.util.Scanner;

public class Second {
	public static void main(String[] args) {
		String s1, s2;
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Word");
		s1 = sc.next();
		n = s1.length();
		if (n % 2 == 0) {
			int a = n / 2;
			s2 = s1.substring(0, a);
			System.out.println(s2);
		} else {
			System.out.println("Null ");
		}
	}
}