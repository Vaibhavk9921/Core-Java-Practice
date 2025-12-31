package onedarray;

import java.util.Scanner;

public class ConvertArrayIntoBinary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[100];
		int i = 0, n;
		System.out.println("Enter A Number");
		n = sc.nextInt();
		while (n > 0) {
			arr[i] = n % 2;
			n = n / 2;
			i++;
		}
		for (int j = i - 1; j >= 0; j--) {
			System.out.print(arr[j]);
		}
	}
}
