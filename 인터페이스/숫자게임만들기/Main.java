package 숫자게임만들기;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		PlusGame game = new PlusGame();

		ArrayList<Member> list = new ArrayList<Member>();
		while (true) {

			System.out.println("[1]회원가입 [2]로그인");
			int menu = sc.nextInt();
			if (menu == 1) {
				System.out.println("ID 입력 >> ");
				String nickName = sc.next();
				System.out.println("PW 입력 >> ");
				String pw = sc.next();
				list.add(new Member(nickName, pw));

			} else if (menu == 2) {
				if (list.size() == 0) {
					System.out.println("먼저 회원가입을 해주세요");
					continue;
				}
				boolean sw = false;
				while (true) {
					System.out.println("ID 입력 >> ");
					String nickName = sc.next();
					System.out.println("PW 입력 >> ");
					String pw = sc.next();
					for (int i = 0; i < list.size(); i++) {
						if (list.get(i).getNickName().equals(nickName) && list.get(i).getPw().equals(pw)) {
							System.out.println("로그인 성공");
							sw = true;
							break;
						}
						if ((i == list.size() - 1)
								&& !(list.get(i).getNickName().equals(nickName) && list.get(i).getPw().equals(pw))) {
							System.out.println("로그인 실패");
						}
					}
				}

			} else {
				System.out.println("다시 입력하세요");
			}

			while (true) {
				game.random();

				System.out.println(game.getQuizMsg());
				int ans = sc.nextInt();
				if (game.checkAnswer(ans))
					System.out.println("ok");

			}

		}
	}

}
