package exex;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("현재몸무게 : ");
		int num1 = sc.nextInt();
		System.out.print("목표몸무게 : ");
		int num2 = sc.nextInt();

		for (int i = 1; i <= 7; i++) {
			System.out.print(i + "주차 감량 몸무게 : ");
			int num3 = sc.nextInt();
			num1 -= num3;
			if (num1 <= num2) {
				System.out.println(num1 + "kg 달성!! 축하합니다!!");
				break;
			}
		}
		sc.close();

	}

}
