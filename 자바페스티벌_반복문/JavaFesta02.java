import java.util.Scanner;

public class JavaFesta02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("일한시간을 입력하세요 : ");

		// 8시간 이하 근무 : 시급 9000원 계산
		// 8시간 초과 근무 : 초과한 시간만 1.5배로 쳐서 계산

		int time = sc.nextInt();
		int minpay = 5000; // 최저시급
		int minTime = time - 8; // 초과근무 시간

		int ans = (time > 8) ? ans = (int) ((time - minTime) * minpay + (minTime * minpay) * 1.5)
				: (ans = time * minpay);

		System.out.println("총 임금은 " + ans + "원 입니다.");
		
		sc.close();

	}

}
