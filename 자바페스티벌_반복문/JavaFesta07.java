import java.util.Scanner;

public class JavaFesta07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("행 개수 : ");
		int num = sc.nextInt();

		sc.close();
		for (int j = num; j >= 1; j--) {
			for (int i = 1; i <= j; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
