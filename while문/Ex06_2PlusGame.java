import java.util.Random;
import java.util.Scanner;

public class Ex06_2PlusGame {

	public static void main(String[] args) {

		// 1. 랜덤, 입력하는 도구 가져오기
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);

		// 2. 출력문 --> 한번만
		System.out.println("===Plus Game===");

		// 틀린 횟수 저장하는 변수
		int cnt = 0;

		while (true) {
			
			// 3. 랜덤한 숫자 2개를 가져온다
			int num1 = rd.nextInt(50) + 1;
			int num2 = rd.nextInt(50) + 1;

			System.out.print(num1 + "+" + num2 + "=");

			// 답을 입력받는다.
			int answer = sc.nextInt();
			// 입력한 답 == 실제답 --> s/f
			if (answer == (num1 + num2)) {
				// s --> while문 처음으로 돌아간다
				System.out.println("success");
			} else {
				// 틀렸다 --> 틀린횟수 +1
				cnt++;
				if (cnt > 2) {
					break;
				}
				System.out.println("fail");
				System.out.println("계속 하시겠습니까? >> ");
				String answer2 = sc.next();
				if (answer2.equals("N")) {
					break;
				}
			}
		}
		sc.close();

		// f --> 사용자한테 계속 할건지 물어본다
		// 틀린 횟수도 +1
		// 사용자가 N/Y를 입력한다.
		// Y : while문 처음으로 돌아간다
		// N : break;

		// 사용자가 틀린 횟수가 3번이상이 되면 break;
		
		/*
		제어문 - 조건문, 반복문
		- 개발자가 원하는 방향으로 컴파일을 진행하기 위해
		조건문 : 판단
		if, if-else, if else if 문, + switch
		반복문 : 프로그램 개발자는 코드를 최소로 작성하는데 목표
		while, do-while, for문
		while(조건식) {
			실행코드
		} --> break; continue;
		--> 사용자가 언제 종료할지 모름
		do {
			적어도 한번은 실행시킬 코드
		} while(); --> break; continue;
		
		
		*/
		}

	}


