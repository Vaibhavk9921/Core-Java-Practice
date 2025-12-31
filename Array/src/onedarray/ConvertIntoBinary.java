package onedarray;

import java.util.Scanner;

public class ConvertIntoBinary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		int[] arr = new int[10];
		int i = 0;
		while (n > 0) {
			arr[i] = n % 2;
			n = n / 2;
			i++;
		}
		System.out.println("Binary Number is");
		for (int j = i - 1; j >= 0; j--) {
			System.out.print(arr[j]);
		}
	}
}
