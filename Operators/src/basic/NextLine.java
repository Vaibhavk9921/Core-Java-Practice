package basic;

import java.util.Scanner;

public class NextLine {
	public static void main(String[] args) {
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name :");
		name = sc.nextLine();
		System.out.println("Your Name :" + name);
	}
}
