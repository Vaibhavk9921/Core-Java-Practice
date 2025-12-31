package abc;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Test {
	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<>();
		System.out.println(ar.size());
		// Add items to arraylist
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(40);
		ar.add(50);
		System.out.println(ar.size());
		// add all
		ArrayList<Integer> ar1 = new ArrayList<>();
		ar1.add(60);
		ar1.add(70);
		ar1.add(80);
		ar.addAll(ar1);
		System.out.println(ar);
		// Remove By Index
		ar.remove(0);
		System.out.println(ar);
		ar.remove(2);
		System.out.println(ar);
		// toArray
		Integer[] arr = new Integer[ar.size()];
		ar.toArray(arr);
 		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		// Show Items of Collection
		System.out.println("By Using For Loop");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("By Using For Each Loop");
		for (Integer x : arr) {
			System.out.println(x);
		}
		System.out.println("By Using Iterator");
		// Forward Direction Only
		Iterator<Integer> it = ar.iterator();
		while (it.hasNext()) {
			Integer y = it.next();
			System.out.println(y);
		}
		// Set
		ArrayList<Integer> ar2 = new ArrayList<>();
		ar2.add(10);
		ar2.add(20);
		ar2.add(30);
		ar2.add(40);
		ar2.add(20);
		System.out.println(ar2);
		ar2.add(1, 90);
		System.out.println(ar2);
		int x = ar2.indexOf(30);
		System.out.println(x);
		x = ar2.lastIndexOf(20);
		System.out.println(x);
		// Queue
		Vector<Integer> ob = new Vector<>();
		ob.add(10);
		ob.add(20);
		ob.add(30);
		Enumeration<Integer> e1 = ob.elements();
		while (e1.hasMoreElements()) {
			Integer x1 = (Integer) e1.nextElement();
			System.out.println(x);
		}
		Iterator<Integer> it1 = ob.iterator();
		while (it1.hasNext()) {
			Integer x2 = (Integer) it1.next();
			System.out.println(x2);
		}
	}
}