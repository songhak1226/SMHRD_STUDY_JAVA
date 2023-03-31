import java.util.Scanner;

public class JavaFesta04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int money = 0;

		int m10000;
		int m5000;
		int m1000;     //잔돈 천원
		int m500;      //잔돈 오백원
		int m100;      //잔돈 백원

		System.out.print("넣을 금액 : ");
		money = sc.nextInt();
		
		System.out.println("잔돈 : " + money);

		m10000 = money / 10000;
		money = money % 10000;
		m5000 = money / 5000;
		money = money % 5000;
		m1000 = money / 1000;     //잔돈의 천원
		money = money % 1000;     //잔돈 천원을 구하고 나머지
		m500 = money / 500;       //잔돈의 오백원
		money = money % 500;      //잔돈 오백원을 구하고 나머지
		m100 = money / 100;       //잔돈의 백원

		System.out.println("10000원 : " + m10000 + "개");
		System.out.println("5000원 : " + m5000 + "개");		
		System.out.println("1000원 : " + m1000 + "개");
		System.out.println("500원 : " + m500 + "개");
		System.out.println("100원 : " + m100 + "개");

		sc.close();

	}

}
