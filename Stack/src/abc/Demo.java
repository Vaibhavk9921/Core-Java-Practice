package abc;

import java.util.Stack;

public class Demo {
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		// add Item By Using Push
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		// Remove by Pop
		System.out.println(st.pop());
  		System.out.println(st.isEmpty());
		while (!st.isEmpty()) {
			System.out.println(st.pop());
		}
		System.out.println(st.isEmpty());
	}
}