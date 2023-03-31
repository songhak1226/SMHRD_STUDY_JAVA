package JavaFestival메서드;

public class JavaFesta메서드04 {

	public static void main(String[] args) {
		int base = 2;
		int n = 5;
		int result = powerN(base, n);
		System.out.println("결과확인 : " + result);

		// 매개변수 : 2개 int
		// 리턴타입 : int
		// base 의 n승
		// base를 n번 곱한 결과값

	}

	public static int powerN(int base, int n) {
		//base를 n번 곱하는 걸 반복
		int num = 1;
		for (int i = 1; i <= n; i++) {
			num *= base;
		}
		return num;
	}

}
