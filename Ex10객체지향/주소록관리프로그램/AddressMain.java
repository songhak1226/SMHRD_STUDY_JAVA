package 주소록관리프로그램;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Address> ad = new ArrayList<Address>();

		while (true) {
			System.out.println("[1]추가 [2]전체조회 [3]삭제 [4]검색 [5]종료 >> ");
			int select = sc.nextInt();

			if (select == 1) {
				System.out.println("이름 : ");
				String name = sc.next();
				System.out.println("나이 : ");
				int age = sc.nextInt();
				System.out.println("전화번호 : ");
				String num = sc.next();
				Address address = new Address(name, age, num);
				ad.add(address);

			} else if (select == 2) {
				if (ad.size() == 0) {
					System.out.println("등록된 연락처가 없습니다.");

				} else {
					for (int i = 0; i < ad.size(); i++) {
						System.out.println((i + 1) + ". " + ad.get(i).getName() + "(" + ad.get(i).getAge() + ") : "
								+ ad.get(i).getPhoneNumber());
					}
				}

			} else if (select == 3) {
				if (ad.size() == 0) {
					System.out.println("등록된 연락처가 없습니다.");

				} else {
					for (int i = 0; i < ad.size(); i++) {
						System.out.println((i + 1) + ". " + ad.get(i).getName() + "(" + ad.get(i).getAge() + "세) : "
								+ ad.get(i).getPhoneNumber());
					}
					System.out.println("삭제할 번호 입력 : ");
					int delNum = sc.nextInt();
					ad.remove(delNum - 1);
				}

			} else if (select == 4) {
				System.out.println("검색할 이름 입력 : ");
				String search = sc.next();
				for (int i = 0; i < ad.size(); i++) {
					if (ad.get(i).getName().equals(search)) {
						System.out.println((i + 1) + ". " + ad.get(i).getName() + "(" + ad.get(i).getAge() + ") : "
								+ ad.get(i).getPhoneNumber());
					}
				}

			} else if (select == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("다시 입력해주세요");
			}
			
			sc.close();
		}

	}

}
