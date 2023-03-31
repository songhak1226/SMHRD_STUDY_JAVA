import java.util.Scanner;

public class Ex07채점프로그램 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] correct = { 1, 2, 3, 4, 5 };

		int[] arr = new int[5];
		
		System.out.println("==채점하기==");
		System.out.println("답을 입력하세요");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + 1 + "번답 >> ");
			arr[i] = sc.nextInt();
		}
		
		sc.close();

		System.out.print("입력한 답은 : ");
		for (int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
		System.out.println("정답확인");

		int score = 0;
		for (int i = 0; i < arr.length; i++) {
			if (correct[i] == arr[i]) {
				System.out.print("O ");
				score += 20;
			} else {
				System.out.print("X ");
			}
		}
		
		System.out.println("/ 총점 : " + score);

	}

}
