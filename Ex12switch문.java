import java.util.Scanner;

public class Ex12switch문 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int money = 0;
		int menu = 0;
		int price = 0;

		int m1000;     //잔돈 천원
		int m500;      //잔돈 오백원
		int m100;      //잔돈 백원

		System.out.print("넣을 금액 : ");
		money = sc.nextInt();

		System.out.println("--메뉴--");
		System.out.print("1.콜라(1800원) 2.파워에이드(2000원) 3.탄산수(1200원) >>");
		menu = sc.nextInt();

		switch (menu) {
		case 1:
			price = 1800;
			break;
		case 2:
			price = 2000;
			break;
		case 3:
			price = 1200;
			break;
		default:
			System.out.println("메뉴를 다시 입력해주세요.");
			break;
		}

		if (money >= price) {
			money = money - price;           //잔돈을 구하고 그 값을 다시 money에 입력
			System.out.println("잔돈 : " + money + "원");
		} else {
			System.out.println("돈이 부족해요 ㅠㅡㅜ");
		}

		m1000 = money / 1000;     //잔돈의 천원
		money = money % 1000;     //잔돈 천원을 구하고 나머지
		m500 = money / 500;       //잔돈의 오백원
		money = money % 500;      //잔돈 오백원을 구하고 나머지
		m100 = money / 100;       //잔돈의 백원

		System.out.println("천원 : " + m1000);
		System.out.println("오백원 : " + m500);
		System.out.println("백원 : " + m100);

		sc.close();
	}

}
