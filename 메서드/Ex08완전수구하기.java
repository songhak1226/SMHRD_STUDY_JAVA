package 메서드;

public class Ex08완전수구하기 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		boolean divisor = isDivisor(num1, num2);

		System.out.println(divisor);
		// num2가 num1의 약수인지?
		// num1이 num2의 배수인지?
		// num2가 num1을 나누어 떨어지게 하는지?

		getDivisor(10);
		getDivisor(16);
		getDivisor(24);

		int num = 20;
		int result = getSumOfDivisor(num);

		System.out.println(num + "약수의 합 : " + result);

		getDivisor(num);

		// 완전수인지 아닌지 판단해주는 isPerfectNumber()
		// 완전수란? : 자기자신을 제외한 약수의 합이 자기자신과 같은 수
		// ex) 6 : 1,2,3 -> 6 / 10 : 1,2,5 -> 8 / 28 : 1,2,4,7,14 -> 28
		int num3 = 6;
		boolean result2 = isPerfectNumber(num3);
		System.out.println(result2); // true/false

		int startValue = 2;
		int endValue = 1000;
		getPerfectNumber(startValue, endValue);
	}

	public static boolean isDivisor(int a, int b) {
		if (a % b == 0) {
			return true;
		}
		return false;
	}

	public static void getDivisor(int a) {
		System.out.print(a + "의 약수 : ");
		for (int i = 1; i <= a; i++) {
			if (isDivisor(a, i))
				System.out.print(i + " ");
		}
		System.out.println();
	}

	public static int getSumOfDivisor(int num) {
		int sum = 0;
		for (int i = 1; i <= num / 2; i++) {

			if (isDivisor(num, i))
				sum = sum + i;
		}
		return sum + num;
	}

	public static boolean isPerfectNumber(int num3) {
		/*
		 * int sum = 0; for (int i = 1; i <= a; i++) {
		 * 
		 * if (isDivisor(a, i)) sum = sum + i; } if (sum - a == a) { return true; }
		 * return false;
		 */

		if (getSumOfDivisor(num3) - num3 == num3) {
			return true;
		} else {
			return false;
		}
	}

	public static void getPerfectNumber(int num1, int num2) {
		System.out.print(num1 + "~" + num2 + "까지의 완전수 : ");
		for (int i = num1; i <= num2; i++) {
			if (isPerfectNumber(i) == true) {
				System.out.print(i + " ");
			}
		}
	}

}
