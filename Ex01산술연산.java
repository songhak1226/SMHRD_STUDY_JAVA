
public class Ex01산술연산 {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 7;
		float num3 = 10f;
		float num4 = 7f;

		// 정수와 정수 연산시에는 무조건 결과는 정수로
		System.out.println(num1 / num2);
		// 실수와 실수 연산시에는 무조건 결과는 실수로
		// 실수 연산시에는 부동소수점으로 오차가 있을 수 있음
		System.out.println(num3 / num4);
		// 정수와 실수 연산시에는 무조건 결과는 실수로
		System.out.println(num1 / num4);
		System.out.println(num3 % num4);
		
		
		int num5 = 7;
		int num6 = 3;
		
		System.out.println("더한 결과 : " + (num5+num6));
		System.out.println("뺀 결과 : " + (num5-num6));
		System.out.println("곱한 결과 : " + (num5*num6));
		System.out.println("나눈 결과 : " + ((double) num5/num6)); // 실수형으로 출력
		
		
		//-------------------------------------------------//
		
		/*
		int num11 = 10;
		int num12 = 7;
		String num13 = "10";
		String num14 = "7";
		
		System.out.println(num11 + num12);
		System.out.println(num13 + num14);
		System.out.println(num11 + num14);
		
		
		String a = 10 + 7 + ""; //앞에서부터 연산 10+7 먼저 하고 그다음에 문자열로 변환
		String b = 8 + "" + 2;
		String c = "" + 5 + 2;
		
		System.out.println(a);  //17
		System.out.println(b);  //82
		System.out.println(c);  //52
		*/
		
		
		

	}

}
