import java.util.Scanner;

public class Ex07채점프로그램답안2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] answer = { 1, 4, 3, 2, 1 }; // 실제답
		int[] input = new int[5]; // 사용자가 입력한 답 저장
		int score = 0;// 총점 저장
		String check = "";

		// 답 입력
		for (int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
			if (answer[i] == input[i]) {
				check = check + "O ";
				score += 20;
			} else {
				check += "X ";
			}
		}
		sc.close();
		System.out.println(check);
		System.out.println("총점 : " + score);

	}

}
