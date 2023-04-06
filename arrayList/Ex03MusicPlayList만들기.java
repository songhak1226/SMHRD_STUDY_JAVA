package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex03MusicPlayList만들기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<String> al = new ArrayList<String>();

		while (true) {
			System.out.print("[1]노래추가 [2]노래삭제 [3]종료 >> ");
			int input = sc.nextInt();
			if (input == 1) {
				System.out.println("======= 현재 재생 목록 =======");
				if (al.size() == 0) {
					System.out.println("재생 목록이 없습니다.");
					System.out.println("==========================");
					System.out.print("[1]마지막 위치에 추가 [2]원하는 위치에 추가>>");
					int musicIn = sc.nextInt();
					if (musicIn == 1) {
						System.out.println("추가 할 노래 입력 : ");
						String music = sc.next();
						al.add(music);
						System.out.println("추가가 완료되었습니다.");
					} else if (musicIn == 2) {
						System.out.println("추가 할 노래 입력 : ");
						String music = sc.next();
						System.out.println("추가 할 위치 입력 : ");
						int loc = sc.nextInt();
						if (al.size() == 0) {
							System.out.println("해당 순서에 추가 할 수 없습니다.");
							continue;
						} else {
							al.add(loc - 1, music);
						}
					} else if (musicIn == 3) {
						System.out.println("취소");
					} else {
						System.out.println("다시입력하세요");
					}
				} else {
					for (int i = 0; i < al.size(); i++) {
						System.out.println((i + 1) + "." + al.get(i));
					}
					System.out.println("==========================");
					System.out.print("[1]마지막 위치에 추가 [2]원하는 위치에 추가 >>");
					int musicIn = sc.nextInt();
					if (musicIn == 1) {
						System.out.println("추가 할 노래 입력 : ");
						String music = sc.next();
						al.add(music);
						System.out.println("추가가 완료되었습니다.");
					} else if (musicIn == 2) {
						System.out.println("추가 할 노래 입력 : ");
						String music = sc.next();
						System.out.println("추가 할 위치 입력 : ");
						int loc = sc.nextInt();
						al.add(loc - 1, music);
					} else if (musicIn == 3) {
						System.out.println("취소");
					} else {
						System.out.println("다시 입력해주세요");
					}
				}
			} else if (input == 2) {
				System.out.println("======= 현재 재생 목록 =======");
				if (al.size() == 0) {
					System.out.println("재생 목록이 없습니다.");
					System.out.println("==========================");
				} else {
					for (int i = 0; i < al.size(); i++) {
						System.out.println(i + 1 + "." + al.get(i));
					}
					System.out.println("==========================");
					System.out.print("[1]선택 삭제 [2]전체 삭제 >>");
					int delNum = sc.nextInt();
					if (delNum == 1) {
						System.out.print("삭제할 노래 선택 >> ");
						int delMusic = sc.nextInt();
						al.remove(delMusic);
						System.out.println("노래가 삭제되었습니다.");
					} else if (delNum == 2) {
						al.clear();
						System.out.println("전체 list가 삭제되었습니다.");
					} else {
						System.out.println("다시 입력해주세요");
					}
				}

			} else if (input == 3) {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			} else {
				System.out.println("다시 입력하세요");
			}
		}
		sc.close();

	}

}
