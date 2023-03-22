import java.util.Scanner;

public class Ex09삼항연산 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		System.out.print("노동시간을 입력하세요 : ");

		// 8시간 이하 근무 : 시급 9000원 계산
		// 8시간 초과 근무 : 초과한 시간만 1.5배로 쳐서 계산

		int time = sc.nextInt();
		int minpay = 9000;         //최저시급
		int minTime = time - 8;    //초과근무 시간

		int ans = (time > 8) ? ans = (int) ((time - minTime) * minpay + (minTime * minpay) * 1.5) : (ans = time * minpay);

		System.out.println("총 임금은 " + ans + "원 입니다.");
		//위에 식이 내가 한거 아래가 강사님이 한거
		

		/*
		int work = sc.nextInt();
		double pay = (work > 8) ? 8 * 9000 + (work - 8) * 9000 * 1.5 : 9000 * work;
		//실수 -> 정수 형변환 절대 자동 형변환 해주지 않음
		//같은 크기더라도 실수가 표현범위가 더 넓기 때문
		System.out.println(pay + "입니다.");
		System.out.printf("총 임금은 %.0f원 입니다", pay);
		*/
		
		sc.close();
	}

}
