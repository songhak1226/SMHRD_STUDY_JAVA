
public class Ex09switch문 {

	public static void main(String[] args) {

		int num = 20;

		// num이 20을 가지고 있으면 "20",30을 가지고 있으면 "30"출력
		// 그 나머지 값을 가지고 있으면 "다른수"

		// switch(식 or 값)
		switch (num) {
		case 20:
			System.out.println(20);
			break; // switch문을 멈추고 다음문장을 실행하도록 하는 명령어
			       // break가 없으면 실행하고 아래 case가 아닌 case 안의 실행문을 출력함

		case 30:
			System.out.println(30);
			break;

		default:
			System.out.println("다른수");

		}

	}

}
