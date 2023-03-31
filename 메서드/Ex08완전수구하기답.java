package 메서드;

public class Ex08완전수구하기답 {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 2;
		boolean divisor = isDivisor(num1, num2);
		System.out.println(divisor);// true
		// num2가 num1의 약수인지 아닌지?
		// num1이 num2의 배수인지 아닌지?
		// num2가 num1을 나누어 떨어지게 하는지!

		getDivisor(10);
		// 10의 약수 : 1 2 5 10
		getDivisor(24);
		getDivisor(16);

		// main 안쪽

		int num3 = 6;
		boolean result2 = isPerfectNumber(num3);
		System.out.println(result2); // true/false
		
		int startValue = 2;
		int endValue = 1000;
		getPerfectNumber(startValue, endValue);

	}

	// main 밖
	// 1. isDivisor() : 매개변수 int 2개, 리턴타입 boolean(true, false)
	public static boolean isDivisor(int num1, int num2) {
		// num2가 num1을 나누어 떨어지게 하는지 판단
		if (num1 % num2 == 0) {
			return true;
		} else {
			return false;
		}
		// is라는 키워드가 붙은 메서드는 결과값이(리턴타입이) boolean
	}

	// 2. getDivisor() : 출력하는 기능을 가지고 있다(void), 매개변수 int 1개
	public static void getDivisor(int num1) {

		// num1의 약수를 출력하는 기능
		// 4의 약수 : 1 2 4
		System.out.print(num1 + "의 약수 : ");

		for (int i = 1; i <= num1; i++) {
			// i가 num1의 약수인지 아닌지? ---> true/false
			// isDivisor()
			// num2가 num1의 약수인지 아닌지? ---> true/false
			if (isDivisor(num1, i)) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

	}

	//
	public static int getSumOfDivisor(int num) {
		int sum = 0;
		for (int i = 1; i <= num / 2; i++) {

			if (isDivisor(num, i))
				sum = sum + i;
		}
		return sum + num;
	}

	// 4.isPerfectNumber90 : 매개변수 int 1개, 리턴타입 boolean
	public static boolean isPerfectNumber(int num3) {
		// num3가 완전수인지 아닌지?
		// 자기자신을 제외한 약수의 합 == 자기자신
		if (getSumOfDivisor(num3) - num3 == num3) {
			return true;
		} else {
			return false;
		}
		// 약수의 합 = 자기자신 * 2 라고 풀어도 똑같음
	}

	// 5.getPerfectNumber
	public static void getPerfectNumber(int num1, int num2) {
		// num1 : s, num2 : e
		System.out.print((num1 + "과" + num2 + "사이의 완전수 : "));
		// 2라는 숫자가 완전수인지 아닌지 판단 --true--출력
		for (int i = num1; i <= num2; i++)
			if (isPerfectNumber(2) == true) {
				System.out.print(i + " ");
			}
	}

}
