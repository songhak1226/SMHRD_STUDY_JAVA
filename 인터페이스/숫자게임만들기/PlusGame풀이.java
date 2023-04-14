package 숫자게임만들기;

import java.util.Random;
import java.util.Scanner;

public class PlusGame풀이 implements OperatorGame {

	Scanner sc = new Scanner(System.in);
	Random rd = new Random();
	int num1 = 0;
	int num2 = 0;

	@Override
	public int random() {
		return rd.nextInt(50) + 1;
	}

	@Override
	public String getQuizMsg() {
		num1 = random();
		num2 = random();

		return num1 + " + " + num2 + " = ";

	}

	@Override
	public boolean checkAnswer(int ans) {
		if (num1 + num2 == ans) {
			return true;
		} else {
			return false;
		}
	}

	// 개발자 1
	// 자연쌤이 주신 인터페이스를 사용해서 구현하기
	// 기능을 완성하기

}
