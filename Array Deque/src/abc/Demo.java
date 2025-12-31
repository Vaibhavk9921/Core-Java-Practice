package abc;

import java.util.ArrayDeque;

public class Demo {
	public static void main(String[] args) {
		ArrayDeque<Integer> ob = new ArrayDeque<>();
		ob.add(10);
		ob.add(20);
		ob.add(30);
		System.out.println(ob.remove());
		ob.addFirst(40);
		ob.addLast(90);
		System.out.println(ob.removeFirst());
		System.out.println(ob.removeLast());
	}
}