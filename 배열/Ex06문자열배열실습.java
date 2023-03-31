import java.util.Scanner;

public class Ex06문자열배열실습 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] arrStr = new String[8];

		for (int i = 0; i < arrStr.length; i++) {
			System.out.print("명단을 입력해 주세요 : ");
			arrStr[i] = sc.next();
		}

		for (String a : arrStr) {
			System.out.print(a + " ");
		}
		System.out.println();

		// String[] arrStr = { "김지은", "박수현", "정세연", "이명훈", "강예진", "임명진", "정형", "채수민" };

		System.out.print("검색할 이름 입력 >> ");
		String name = sc.next();

		sc.close();

		for (int i = 0; i < arrStr.length; i++) {
			if (arrStr[i].equals(name)) {
				System.out.println(arrStr[i] + "님은 " + i + "번째 인덱스에 저장되어 있습니다.");
				break;
			}
		}

	}

}
