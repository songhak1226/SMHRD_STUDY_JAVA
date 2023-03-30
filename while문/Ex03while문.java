import java.util.Scanner;

public class Ex03while문 {

	public static void main(String[] args) {

		// 키보드로부터 입력한 숫자를 누적하여 누적결과를 출력해주는 프로그램을 작성하시오.
		// (단, -1을 입력한 경우 프로그램 종료)

		Scanner sc = new Scanner(System.in);

		int input = 0;
		int num = 0;
		int odd = 0;  //홀수 개수 저장
		int even = 0; //짝수 개수 저장
		
/*
		while (true) {
			if (input != -1) {
				num += input;
				System.out.print("숫자 입력 : ");
				input = sc.nextInt();
			} else if (input == -1) {
				break;
			}
		}
*/
		while (true) {
			System.out.print("숫자 입력 : ");
			input = sc.nextInt();
			if (input == -1) { //홀수
				break;
			}
			if(input /2 == 1) { //짝수
				++odd;
			} else {
				++even;
			}
			
			num += input;
		}

		System.out.println("누적결과 : " + num);
		System.out.println("홀수 개수 : " + odd);
		System.out.println("짝수 개수 : " + even);
		

		sc.close();

	}

}
