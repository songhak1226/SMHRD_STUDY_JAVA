
public class Ex02산술연산 {

	public static void main(String[] args) {

		int num1 = 456;

		System.out.println("결과확인 : " + (num1 - (num1 % 100)));

		int num2 = 777;
		System.out.println("결과확인 : " + (num2 / 10 * 10 + 1));
		System.out.println("결과확인 : " + (num2 - (num2 % 10) + 1));

	}

}
