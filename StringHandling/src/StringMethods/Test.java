package StringMethods;

public class Test {
	public static void main(String[] args) {

		// Length
		System.out.println("*** Length ***");
		String s1 = "Hello World !";
		int x = s1.length();
		System.out.println(x);
		System.out.println("*** CharAt ***");
		// CharAt
		char ch = s1.charAt(0);
		System.out.println(ch);
		System.out.println("*** ToCharArray ***");
		// ToCharArray
		char arr[] = s1.toCharArray();
		for (int i = 0; i < s1.length(); i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		for (char c : arr) {
			System.out.println(c);
		}
		System.out.println("*** GetBytes ***");
		// GetBytes
		byte[] arr1 = s1.getBytes();
		for (byte b : arr1) {
			System.out.println(b);
		}

		System.out.println("*** IndexOf ***");

		// indexof

		int y = s1.indexOf('1');
		System.out.println(y);
		y = -1;
		while (true) {
			y = s1.indexOf('l', y + 1);
			System.out.println(y);
			if (y == -1) {
				break;
			}
		}
		System.out.println("*** LastIndexOf ***");

		// LastIndexOf

		x = s1.lastIndexOf('l');
		System.out.println(x);

		System.out.println("*** Equals & EqualsIgnoreCase ***");

		// Equals & EqualsIgnoreCase

		String s2 = new String("Hello");
		String s3 = new String("hello");
		if (s2.equals(s3)) {
			System.out.println("Equals");
		} else {
			System.out.println("Not Equals");
		}
		if (s2.equalsIgnoreCase(s3)) {
			System.out.println("Equals");
		} else {
			System.out.println("Not Equals");
		}

		System.out.println("*** StartsWith & EndsWith ***");

		// StartsWith & EndsWith

		System.out.println(s1.startsWith("H"));
		System.out.println(s1.startsWith("He"));
		System.out.println(s1.startsWith("ello"));
		System.out.println(s1.endsWith("d"));
		System.out.println(s1.endsWith("worl"));

		System.out.println("*** Substring ***");

		// Substring

		String s4 = s1.substring(2, 7);
		System.out.println(s4);
		s4 = s1.substring(2);
		System.out.println(s2);

		// Concat

		System.out.println("*** Concat ***");

		String s5 = "Hello";
		String s6 = "World";
		String s7 = s5 + s6;
		System.out.println(s7);
		s7 = s5.concat(s6);

		System.out.println("*** Replace ***");

		// Replace

		String s8 = s1.replace('H', 'h');
		System.out.println(s8);
		s8 = s1.replace("Hello", "Hi");
		System.out.println(s8);

		System.out.println("*** Trim ***");

		// Trim

		String s9 = "Hello";
		String s10 = " Hello ";
		if (s9.equals(s10.trim())) {
			System.out.println("Equals");
		} else {
			System.out.println("Not Equals ");
		}

		System.out.println("*** ToUpperCase & ToLowerCase ***");

		// ToUpperCase & ToLowerCase

		String a = s1.toUpperCase();
		System.out.println(a);

		a = s1.toLowerCase();
		System.out.println(a);

		// Split

		String[] arr2 = s1.split(" ");
		for (String n : arr2) {
			System.out.print(n);
		}
		System.out.println();
		s1 = "a,b,c,d,e,f,g";
		arr2 = s1.split(",");
		for (String n : arr2) {
			System.out.print(n);
		}
	}
}