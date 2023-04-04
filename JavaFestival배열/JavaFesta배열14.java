package JavaFestival배열;

import java.util.Scanner;

public class JavaFesta배열14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 입력하는 도구 가져오기

		// 출력문 : 입력(1)
		System.out.print("첫 번째 숫자 입력 >> ");
		int num1 = sc.nextInt();
		// 출력문 : 입력(2)
		System.out.print("두 번째 숫자 입력 >> ");
		int num2 = sc.nextInt();
		
		sc.close();

		// (1)*(2)
		// 출력문1
		// (1)*(2)의 일의 자리 숫자
		int out1 = num1 * (num2 % 100 % 10);
		System.out.println(out1);
		// 출력문2
		// (1)*(2)의 집의 자리 숫자
		int out2 = num1 * (num2 % 100 / 10);
		System.out.println(out2);
		// 출력문3
		// (1)*(2)의 백의 자리 숫자
		int out3 = num1 * (num2 / 100);
		System.out.println(out3);

		// 마지막 결과값
		// (1) * (2)
		System.out.println(num1 * num2);
	}

}
