package whileloop;

import java.util.Scanner;

public class FactorialProgram {
	public static void main(String[] args) {
		int i, n, f;
		i = 1;
		f = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Number");
		n = sc.nextInt();
		while (i <= n) {
			f = f * i;
			i = i + 1;
		}
		System.out.println("Factorial is " + f);
	}
}
