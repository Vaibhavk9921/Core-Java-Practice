package elseif;

import java.util.Scanner;

public class PercentageandGrade {
	public static void main(String[] args) {
		float m1, m2, m3, m4, m5, total, percentage;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks of 1st Subject :");
		m1 = sc.nextFloat();
		System.out.println("Enter Marks of 2nd Subject :");
		m2 = sc.nextFloat();
		System.out.println("Enter Marks of 3rd Subject :");
		m3 = sc.nextFloat();
		System.out.println("Enter Marks of 4th Subject :");
		m4 = sc.nextFloat();
		System.out.println("Enter Marks of 5th Subject :");
		m5 = sc.nextFloat();
		total = m1 + m2 + m3 + m4 + m5;
		percentage = (total / 500) * 100;
		if (percentage > 90) {
			System.out.println("A Grade");
		} else if (percentage > 80) {
			System.out.println("B Grade");
		} else if (percentage > 70) {
			System.out.println("C Grade");
		} else if (percentage > 60) {
			System.out.println("D Grade");
		} else if (percentage > 50) {
			System.out.println("Pass");
		} else {
			System.out.println("Failed");
		}
	}
}
