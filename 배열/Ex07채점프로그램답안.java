import java.util.Scanner;

public class Ex07채점프로그램답안 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] answer = { 1, 4, 3, 2, 1 }; // 실제답
		int[] input = new int[5]; // 사용자가 입력한 답 저장

		// 답 입력
		for (int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
		}

		sc.close();

		int score = 0;// 총점 저장

		// 입력한 답과 실제답이 같으면 O출력, 다르면 X출력
		for (int i = 0; i < input.length; i++) {
			if (answer[i] == input[i]) {
				System.out.print("O ");
				score += 20;
			} else {
				System.out.print("X ");
			}
		}
		System.out.println("총점 : " + score);

	}

}
