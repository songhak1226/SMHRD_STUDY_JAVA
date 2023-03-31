import java.util.Scanner;

public class Javafesta01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("현재 몸무게 : ");
		int weight = sc.nextInt();
		System.out.print("목표 몸무게 : ");
		int goal = sc.nextInt();
		int num = 0;
		int input = 0;

		while (true) {
			num++;
			System.out.print(num + "주차 감량 몸무게 : ");
			input = sc.nextInt();
			weight = weight - input;
			if (weight <= goal) {
				break;
			}
		}
		System.out.println(weight + "kg 달성!! 축하합니다!");

		sc.close();

	}

}
