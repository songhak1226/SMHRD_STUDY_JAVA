package 돼지저금통프로그램;

public class PiggyBank풀이 {

	int money;
	
	public PiggyBank풀이() {
		System.out.println("돼지저금통 생성");
	}

	public void deposit(int inputMoney) {
		money += inputMoney;

	}

	public void withdraw(int outputMoney) {
		if (money >= outputMoney) {
			money -= outputMoney;
		}

	}
	
	public int showMoney() {
		return money;
	}

}
