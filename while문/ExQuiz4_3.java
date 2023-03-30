import java.util.Scanner;

public class ExQuiz4_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int input = 0;
		System.out.print("현재 몸무게 : ");
		int weight = sc.nextInt();
		System.out.print("목표 몸무게 : ");
		int goal = sc.nextInt();
		int num = 0;

		while (true) {
			num++;
			System.out.print(num + "주차 감량 몸무게 : ");
			input = sc.nextInt();
			weight = weight - input;
			System.out.println("현재 몸무게 : " + weight);
			if (weight <= goal) {
				break;
			}
		}
		System.out.println("최종 몸무게 : " + weight);
		System.out.println("축하합니다!");

		sc.close();

	}

}
