package 월급계산프로그램;

public class PartTimeEmployee extends Employee {

	private int WorkDay;

	public PartTimeEmployee(String empno, String name, int pay, int WorkDay) {
		super(empno, name, pay);
		this.WorkDay = WorkDay;

	}

	@Override
	public void getMoneyPay() {
		System.out.println(this.pay * this.WorkDay + "만원");

	}

	

}
