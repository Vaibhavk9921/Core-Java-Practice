package abc;

import java.util.LinkedList;

public class Demo {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);
		list.addFirst(90);
		System.out.println(list);
		list.addLast(100);
		System.out.println(list);
		System.out.println(list.removeFirst());
		System.out.println(list.removeLast());
	}
}