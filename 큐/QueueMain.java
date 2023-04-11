package 큐;

import java.util.Scanner;

public class QueueMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		IntQueue s = new IntQueue(5);

		int menu = 0;

		while (true) {
			System.out.println("[1]인큐 [2]디큐 [3]피크 [4]덤프 [5]비우기 [6]위치찾기 [7]데이터 개수 [8]종료");
			menu = sc.nextInt();

			if (menu == 1) { // push
				if (!s.isFull()) { // 가득 차 있지 않을 때
					System.out.print("인큐할 값 입력 : ");
					int num = sc.nextInt();
					s.enque(num);
				} else {// 가득 차 있을 때
					System.out.println("큐가 가득차있습니다");
				}

			} else if (menu == 2) {// pop
				if (!s.isEmpty()) { // 비어있지 않을 때
					System.out.println("제거된 값 : " + s.deque());
				} else {// 비어있을 때
					System.out.println("큐가 비어있습니다");
				}

			} else if (menu == 3) { // peek
				if (!s.isEmpty()) { // 비어있지 않을 때
					System.out.println("피크 값 : " + s.peek());
				} else {// 비어있을 때
					System.out.println("큐가 비어있습니다");
				}

			} else if (menu == 4) { // dump
				s.dump();

			} else if (menu == 5) {// clear
				if (!s.isEmpty()) { // 비어있지 않을 때
					s.clear();
					System.out.println("큐를 비웠습니다");
				} else {// 비어있을 때
					System.out.println("큐가 비어있습니다");
				}

			} else if (menu == 6) { // indexOf
				System.out.print("찾고싶은 값 입력 : ");
				int num = sc.nextInt();
				System.out.println("위치 : " + s.indexOf(num));

			} else if (menu == 7) {
				System.out.println("데이터 개수 : " + s.size());

			} else if (menu == 8) {
				System.out.println("종료되었습니다");
				break;

			} else {
				System.out.println("다시 입력해주세요");
			}
		}

	}

}
