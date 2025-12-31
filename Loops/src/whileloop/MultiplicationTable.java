package whileloop;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		int i, n, f;
		i = 1;
		f = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Number");
		n = sc.nextInt();
		while (i <= 10) {
			f = n * i;
			System.out.println(n + " " + "*" + " " + i + " " + "=" + " " + f);
			i = i + 1;
		}
	}
}