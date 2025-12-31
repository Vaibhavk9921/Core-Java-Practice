package onedarray;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Array");
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Your Arrayy is :");
		for (int i = 0; i < 5; i++) {
			System.out.println((arr[i]));
		}
	}
}
