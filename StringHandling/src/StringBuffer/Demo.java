package StringBuffer;

public class Demo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello World !!");
		// Get Length of String Buffer
		System.out.println(sb.length());
		// Get Capacity of String BUffer
		System.out.println(sb.capacity());
		// Append
		// Add Data to End of String Buffer Object
		System.out.println(sb);
		sb.append("hi");
		sb.append(1.2);
		System.out.println(sb);
		// Delete
		// It is Used to Delete Content of String Buffer Object
		sb.deleteCharAt(1);
		sb.delete(1, 7);
		System.out.println(sb);
		// Reverse
		sb.reverse();
		System.out.println(sb);
		StringBuffer sb1 = new StringBuffer("I JAVA");
		System.out.println(sb1);
		sb1.insert(2, "LIKE");
		System.out.println(sb1);
		// Convert String Buffer object to String
		String s4 = sb1.toString();
		System.out.println(s4);
		// SetCharAt
		System.out.println(sb1);
		sb1.setCharAt(0, 'i');
		System.out.println(sb1);
	}
}