import java.util.HashSet;

public class Demo {
	public static void main(String[] args) {
		HashSet<String> fruits = new HashSet<>();
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Pineapple");
		fruits.add("Mango");
		System.out.println("Fruits :" + " " + fruits);
		System.out.println("Contains Apple ?" + " " + fruits.contains("Apple")) ;
	}
}