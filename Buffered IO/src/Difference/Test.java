package Difference;

import java.io.*;

public class Test {
	public static void main(String[] args) throws Exception {
		String s1 = "नमस्कार";
		System.out.println(s1);
		byte[] arr = s1.getBytes();
		ByteArrayInputStream bin;
		bin = new ByteArrayInputStream(arr);
		int x;
		do {
			x = bin.read();
			System.out.println((char) x);
		} while (x != -1);
	}
}