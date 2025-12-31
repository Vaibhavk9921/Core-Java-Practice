package StringClass;

public class Demo {
	public static void main(String[] args) {
		String s1 = "ABCD";

		// Create String Object By Char Array

		System.out.println(s1);
		char arr[] = { 'A', 'B', 'C', 'D' };
		String s2 = new String(arr);
		System.out.println(s2);

		// Create String by Byte Array

		byte arr1[] = { 97, 98, 99, 100 };
		String s3 = new String(arr1);
		System.out.println(s3);
	}
}