package 월급계산프로그램;

public class TempEmployee extends Employee {

	public TempEmployee(String empno, String name, int pay) {
		super(empno, name, pay); // Employee에서 상속받았기 때문에 super사용
	}

	@Override
	public void getMoneyPay() {
		System.out.println(this.pay / 12 + "만원");

	}

}
