package forloop;

public class PyramidPattern {
	public static void main(String[] args) {
		int g = 3, k;
		for (int i = 1; i <= 4; i++) {
			k = 0;
			while (k < g) {
				System.out.print(" ");
				k++;
			}
			g--;
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}