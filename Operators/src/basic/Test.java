package basic;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		int id;
		String name;
		float marks;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id :");
		id = sc.nextInt();
		System.out.println("Enter Name :");
		name = sc.next();
		System.out.println("Enter Marks :");
		marks = sc.nextFloat();
		System.out.println("ID :"+id);
		System.out.println("Name :"+name);
		System.out.println("Marks :"+marks);
	}
}
