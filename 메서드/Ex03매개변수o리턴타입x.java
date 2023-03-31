package 메서드;

public class Ex03매개변수o리턴타입x {

	public static void main(String[] args) {
		// 결과값은 3입니다.
		sumPrint(1, 2);
		//출력하는 기능을 출력해라 라는 코드는 사용 불가
		//System.out.println(sumPrint(1,2));

	}

	// void : 리턴타입이 없음
	// 돌려주는 결과값에 데이터 타입이 없다.
	// 기능자체를 가지고 있는 경우가 많다
	public static void sumPrint(int a, int b) {
		// void가 리턴타입으로 올경우, return이라는 키워드가 필요없음
		System.out.println("결과값은 " + (a + b) + "입니다.");
	}

}
