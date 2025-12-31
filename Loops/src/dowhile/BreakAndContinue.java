package dowhile;

public class BreakAndContinue {
	public static void main(String[] args) {
		System.out.println("===Break===");
		for (int i = 1; i <= 5; i++) {
			if (i == 3) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("===Continue===");
		for (int j = 1; j <= 4; j++) {
			if (j == 3) {
				continue;
			}
			System.out.println(j);
		}
	}
}