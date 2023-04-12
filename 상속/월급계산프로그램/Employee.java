package 월급계산프로그램;

public abstract class Employee {

	protected String empno;
	protected String name;
	protected int pay;

	// protected(접근제한자) : 상속관계에 있는 클래스들은 접근이 가능하도록 도와주는 접근 제한자
	// --> 상속관계가 아닌 클래스는 접근이 불가능하도록 하는 제한자

	public Employee(String empno, String name, int pay) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}
	// 상속관계에서 부모클래스가 생성자를 가지고 있으면 자식클래스에 super();가 있어야한다

	public abstract void getMoneyPay();

	public String print() {
		return empno + " : " + name + " : " + pay;
	};

}
