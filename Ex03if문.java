import java.util.Scanner;

public class Ex03if문 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("JAVA 점수 입력 : ");
		int JAVA = sc.nextInt();
		System.out.print("Python 점수 입력 : ");
		int Python = sc.nextInt();
		System.out.print("Android 점수 입력 : ");
		int Android = sc.nextInt();

		double avg = (JAVA + Python + Android) / 3.0;

		if (avg > 80) {
			System.out.println("합격");
		}

		sc.close();

	}

}
