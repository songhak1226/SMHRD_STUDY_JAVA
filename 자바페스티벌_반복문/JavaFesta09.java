import java.util.Scanner;

public class JavaFesta09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();

		int result = (num + 5) / 10 * 10;

		System.out.println("반올림 수 : " + result);
		
		sc.close();

	}

}
