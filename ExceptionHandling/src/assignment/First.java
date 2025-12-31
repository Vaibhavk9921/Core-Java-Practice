package assignment;

import java.util.Scanner;

public class First {
	public static void main(String[] args) {
		String s1, s2, s3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word ");
		s1 = sc.next();
		int n = s1.length();
		s2 = s1.substring(0, 2);
		s3 = "";
		for (int i = 0; i < n; i++) {
			s3 += s2;
		}
		System.out.println(s3);
	}
}