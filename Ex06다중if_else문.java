import java.util.Scanner;

public class Ex06다중if_else문 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("점수 입력 : ");
		int score = sc.nextInt();

		// 90점 이상 : A
		// 80점 이상 90점 미만 : B
		// 70점 이상 80점 미만 : C
		// 70점 미만 : F
		if (score > 100) {
			System.out.println("점수를 다시 입력하세요");
		} else if (score >= 90) { // 90이상인 점수는 다 걸러줌
			System.out.println("A");
		} else if (score >= 80) { // 90미만인지 물어볼 필요 없음!
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else {
			System.out.println("F");
		}

		sc.close();
	}

}
