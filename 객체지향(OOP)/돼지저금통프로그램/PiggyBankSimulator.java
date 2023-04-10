package 돼지저금통프로그램;

import java.util.Scanner;

public class PiggyBankSimulator {

	public static void main(String[] args) {
		System.out.println("=====돼지 저금통=====");
		// 돼지 저금통 객체 생성
		PiggyBank풀이 pb1 = new PiggyBank풀이();
		PiggyBank pi = new PiggyBank();
		
		// 입금기능 메소드 호출
		pi.setMoney(0);
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입금할 금액 입력 : ");
		int inputMoney = sc.nextInt();
		pb1.deposit(inputMoney);
		
		System.out.println("입금할 금액 입력 : ");
		int inputMoney2 = sc.nextInt();
		pb1.deposit(inputMoney2);
		
		
		// 출금기능 메소드 호출
		pb1.withdraw(300);

		// 잔액확인 메소드 호출
		int m = pb1.showMoney();
		System.out.println(m + "원 남았습니다.");
		
		
	}

}
