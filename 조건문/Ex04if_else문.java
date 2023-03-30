import java.util.Scanner;

public class Ex04if_else문 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("총 금액 입력 : ");
		int num = sc.nextInt();
		System.out.print("인원 수 입력 : ");
		int man = sc.nextInt();

		int pay = num / man;

		if (pay >= 10000 ) {
			System.out.println("10000원 이상 지불");
		} else {
			System.out.println("10000원 미만 지불");
		}
		
		System.out.println("완료");

		sc.close();

	}

}
