package 월급계산프로그램;

public class Main {

	public static void main(String[] args) {

		RegularEmployee emp1 = new RegularEmployee("SMHRD001", "김미희", 4000, 400);
		TempEmployee emp2 = new TempEmployee("SMHRD002", "박문수", 3000);
		PartTimeEmployee emp3 = new PartTimeEmployee("SMHRD003", "임성훈", 10, 10);

		System.out.println(emp1.print());
		emp1.getMoneyPay();
		System.out.println(emp2.print());
		emp2.getMoneyPay();
		System.out.println(emp3.print());
		emp3.getMoneyPay();
	}

}
