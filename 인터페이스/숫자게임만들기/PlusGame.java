package 숫자게임만들기;

import java.util.Random;
import java.util.Scanner;

public class PlusGame implements OperatorGame {

	Scanner sc = new Scanner(System.in);
	Random rd = new Random();

	int num1 = 0;
	int num2 = 0;
	int num3 = 0;
	int round = 0;
	int ans = 0;

	@Override
	public int random() {
		num1 = rd.nextInt(10) + 1;
		num2 = rd.nextInt(10) + 1;
		num3 = num1 - num2;
		return num3;
	}

	@Override
	public String getQuizMsg() {
		round++;
		return round + "라운드 : " + num1 + " - " + num2 + " = ";

	}

	@Override
	public boolean checkAnswer(int ans) {
		if (num1 - num2 == ans) {
			return true;
		} else {
			System.out.println("no");
			while (true) {
				System.out.println(round + "라운드 : " + num1 + " - " + num2 + " = ");
				ans = sc.nextInt();
				if (num1 - num2 == ans) {
					return true;
				}
			}
		}
	}

	// 개발자 1
	// 자연쌤이 주신 인터페이스를 사용해서 구현하기
	// 기능을 완성하기

}
