package abc;

import java.util.Collection;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Demo {
	public static void main(String[] args) {
		TreeMap<Integer, String> ob = new TreeMap<Integer, String>();
		ob.put(19, "xyz");
		ob.put(1, "abc");
		ob.put(1, "pqr");
		ob.put(19, "aaa");
		System.out.println(ob);
		// Get all Keys
		System.out.println("All Keys");
		Set<Integer> keys = ob.keySet();
		for (Integer k : keys) {
			System.out.println(k);
		}
		// Get All Values
		System.out.println("All Values");
		Collection<String> myvalues = ob.values();
		for (String v : myvalues) {
			System.out.println(v);
		}
		// Get All Key + Values
		Set<Entry<Integer, String>> items = ob.entrySet();
		for (Entry<Integer, String> entry : items) {
			System.out.println(entry.getKey() + " " + entry.getValue()  );
		}
	}
}