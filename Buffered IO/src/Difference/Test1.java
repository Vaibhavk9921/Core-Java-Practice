package Difference;

import java.io.*;

public class Test1 {
	public static void main(String[] args) throws Exception {
		String s1 = "नमस्कार";
		System.out.println(s1);
		char[] arr = s1.toCharArray();
		CharArrayReader bin;
		bin = new CharArrayReader(arr);
		int x;
		do {
			x = bin.read();
			System.out.println((char) x);
		} while (x != -1);
	}
}
