package 숫자게임만들기;

import java.util.ArrayList;
import java.util.Scanner;

public class Main풀이 {

	public static void main(String[] args) {

		// 게임은 5라운드까지 진행하기
		// 틀린문제는 그대로 다음 라운드에 출제하기

		// + 회원가입/로그인

		Scanner sc = new Scanner(System.in);
		PlusGame풀이 game = new PlusGame풀이();

		ArrayList<Member풀이> list = new ArrayList<Member풀이>();

		int round = 1; // 게임라운드 체크를 할 수 있는 변수
		boolean check = false; // 로그인 성공/실패 변수
		int cnt = 1; // 3번의 기회를 판단하는 변수
		boolean check2 = true; // 로그인 실패를 판단

		// 게임만 구현(회원가입, 로그인)
		while (round < 6) {
			// 회원가입, 로그인을 했을 경우 게임이 실행되도록
			// 회원가입 진행 --> 로그인을 성공했으면
			if (check == false) {
				System.out.println("[1]회원가입 [2]로그인 >> ");
				int select1 = sc.nextInt();
				if (select1 == 1) {
					// 회원가입
					System.out.println("닉네임 : ");
					String nick = sc.next();
					System.out.println("비밀번호 : ");
					String pw = sc.next();
					// Member 자료형으로 nick,pw를 묶어줌
					Member풀이 mem = new Member풀이(nick, pw);
					// ArrayList ---> 회원정보 관리
					list.add(mem);
					System.out.println("회원가입 성공");
					// while문 처음으로 돌아가는 키워드
					continue;
				} else {
					// 로그인
					System.out.println("닉네임 : ");
					String nick = sc.next();
					System.out.println("비밀번호 : ");
					String pw = sc.next();

					for (int i = 0; i < list.size(); i++) {
						// 사용자가 입력한 닉네임, 비번과 일치하는 데이터가 있는지
						if (list.get(i).getNick().equals(nick) && list.get(i).getPw().equals(pw)) {
							// 로그인 성공
							System.out.println("로그인 성공");
							// 더 이상 로그인이나, 회원가입 코드가 실행될 필요 없음
							check = true;
						} else {
							System.out.println("로그인 실패");
							check2 = false;
							break;
						}
					}
					if (check2 == false) {
						// 다시 화면 볼수있도록
						continue;
					}
				}
			}
			// 5라운드까지만 동작할 수 있도록 만들기
			String quiz = game.getQuizMsg();
			// ---> 문제 정답을 틀렸을 때 똑같은 문제를 다시 출제
			System.out.println(round + " 라운드 : " + quiz);
			// 정답 입력 받기
			int ans = sc.nextInt();
			// 맞는지, 틀린지 확인 : chechAnswer(int ans)
			boolean ck = game.checkAnswer(ans);
			if (ck == false) {
				// 틀렸다면
				// 같은문제를 풀 수 있는 3번의 기회를 준다
				while (cnt < 4) {
					// cnt가 4보다 작을동안 동작
					System.out.println("오답입니다.");
					// 위에 출제되었던 문제 그대로 출력
					System.out.println(round + "라운드 : " + quiz);
					ans = sc.nextInt();
					ck = game.checkAnswer(ans);
					if (ck == true) {
						break;
					}
					cnt++;
				}
			} else {
				System.out.println("정답입니다.");
			}
			// 라운드 종료
			round++;
			System.out.println();
		}

		// 아래는 회원가입 넣은거

		while (true) {
			if (check == false) {
				System.out.println("[1]회원가입 [2]로그인 >>");
				int select1 = sc.nextInt();
				if (select1 == 1) {
					// 회원가입
					System.out.println("닉네임 : ");
					String nick = sc.next();
					System.out.println("비밀번호 : ");
					String pw = sc.next();
					Member풀이 mem = new Member풀이(nick, pw);
					list.add(mem);
					System.out.println("회원가입 성공");
				} else {
					System.out.println("닉네임 : ");
					String nick = sc.next();
					System.out.println("비밀번호 : ");
					String pw = sc.next();
					for (int i = 0; i < list.size(); i++) {
						if (list.get(i).getNick().equals(nick) && list.get(i).getPw().equals(pw)) {
							System.out.println("로그인 성공");
							check = true;
						} else {
							System.out.println("로그인 실패");
						}
					}
				}

			}
			if (check == true) {
				// 게임에 대한 내용(게임시작)
				String quiz = game.getQuizMsg();
				System.out.println(round + "라운드 : " + quiz);
				// 정답을 입력
				int ans = sc.nextInt();
				// 사용자가 정답을 틀렸는지 맞혔는지 ---> checkAns()

				boolean ck = game.checkAnswer(ans); // boolean
				// false를 가지고 오면 이전에 출제된 문제를 그대로 보여주자
				if (ck == false) {
					// 3번의 기회
					while (cnt < 3) {
						System.out.println("오답입니다.");
						System.out.println(round + "라운드 : " + quiz);
						// 정답을 입력
						ans = sc.nextInt();
						cnt++;
						// 정답 체크
						ck = game.checkAnswer(ans);
						// ck == true : 새로운 문제가 보일수 있도록 while문을 빠져나가기
						if (ck == true) {
							break;
						}
					}
					System.out.println("다음 라운드로 넘어갑니다");
					cnt = 1;
				} else {
					// ck == true
					System.out.println("정답입니다");
					round++;
				}
			}
		}
	}
}
