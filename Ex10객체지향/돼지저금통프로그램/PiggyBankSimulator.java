package 돼지저금통프로그램;

public class PiggyBankSimulator {

	public static void main(String[] args) {
		// 돼지 저금통 객체 생성
		
		PiggyBank pb1 = new PiggyBank();

		// 입금기능 메소드 호출
		pb1.deposit(50000);

		// 출금기능 메소드 호출
		pb1.withdraw(10000);

		// 잔액확인 메소드 호출
		pb1.showMoney();

	}

}
