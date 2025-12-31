package dowhile;

public class BreakAndContinue1 {
	public static void main(String[] args) {
		int i, j;
		for (i = 1; i <= 4; i++) {
			for (j = 1; j <= 4; j++) {
				if (j == 3) {
					break;
					// continue;
				}
				System.out.println(i + " " + j);
			}
		}
	}
}
