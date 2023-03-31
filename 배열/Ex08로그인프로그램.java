import java.util.Scanner;

public class Ex08로그인프로그램 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] id = { "", "", "" };

		String[] pw = { "", "", "" };
		int num = 0;
		boolean check = false;

		while (true) {
			System.out.println("1. 회원가입 2. 로그인 3. 종료");
			int input = sc.nextInt();
			if (input == 1) {
				System.out.println("===회원가입===");
				if (num == 3) {
					System.out.println("더 이상 가입할 수 없습니다.");
				} else {
					System.out.print("id 입력 : ");
					id[num] = sc.next();
					System.out.print("pw 입력 : ");
					pw[num] = sc.next();
					System.out.println("가입 성공");
					num++;
				}

			} else if (input == 2) {
				System.out.println("===로그인===");
				System.out.print("id 입력 : ");
				String idInput = sc.next();
				System.out.print("pw 입력 : ");
				String pwInput = sc.next();
				for (int i = 0; i < id.length; i++) {
					if (id[i].equals(idInput) && pw[i].equals(pwInput)) {
						check = true;
						break;
					}
				}
				if (check == true) {
					System.out.println("로그인 성공");
				} else {
					System.out.println("로그인 실패");
				}
				check = false;

			} else if (input == 3) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

		}
		sc.close();
	}

}
