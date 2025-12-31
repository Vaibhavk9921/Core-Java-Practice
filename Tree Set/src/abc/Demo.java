package abc;

import java.util.TreeSet;

public class Demo {
	public static void main(String[] args) {
		TreeSet<Integer> tree = new TreeSet<>();
		tree.add(7);
		tree.add(25);
		tree.add(12);
		tree.add(5);
		tree.add(1);
		System.out.println(tree);
	}
}