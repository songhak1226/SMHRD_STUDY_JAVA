
package 돼지저금통프로그램;

import java.util.Scanner;

public class PiggyBank {
	int money;

	public void deposit(int inputMoney) {
		System.out.println("입금할 금액을 입력하세요");
		money += inputMoney;
	}

	public void withdraw(int outputMoney) {
		money -= outputMoney;
	}

	public void showMoney() {
		System.out.println(money);
	}

}
