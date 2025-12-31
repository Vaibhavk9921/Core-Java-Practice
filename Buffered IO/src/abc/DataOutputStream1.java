package abc;

import java.io.*;

public class DataOutputStream1 {
	public static void main(String[] args) throws Exception {
		FileOutputStream fout;
		fout = new FileOutputStream("C:\\Users\\Admin\\Desktop\\Demo\\test3.txt");
		DataOutputStream dout;
		dout = new DataOutputStream(fout);
		dout.write(190);
		dout.writeBoolean(true);
		dout.writeDouble(1.2);
		fout.close();
	}
}
