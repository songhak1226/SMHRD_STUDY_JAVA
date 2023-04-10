package 물품관리프로그램;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Product> ps = new ArrayList<Product>();

		while (true) {
			System.out.println("[1]물건 추가 [2]예상 판매량 조회 [3]종료 >> ");
			int menu = sc.nextInt();
			if (menu == 1) {
				System.out.println("물건 이름 : ");
				String name = sc.next();
				System.out.println("단가 : ");
				int unitPrice = sc.nextInt();
				System.out.println("수량 : ");
				int amount = sc.nextInt();
				// Product(설계도,자료형)
				// 1. 사용자한테 입력받은 name,proce,amount를 Product자료형으로 묶어주자
				Product p = new Product(name, unitPrice, amount);
				// 2.ps.add()
				ps.add(p);

			} else if (menu == 2) {
				// 예상 판매량 조회
				// ps 안에 있는 데이터들을 다 확인(출력)
				System.out.println("제품명 단가 수량");
				for(int i = 0; i < ps.size();i++) {
					System.out.println(ps.get(i).getName() + " " + ps.get(i).getUnitPrice() + " " + ps.get(i).getAmount());
				}
				// 판매시 전체 매출
				int sum = 0;
				for(int i = 0; i < ps.size(); i++) {
					sum += (ps.get(i).getUnitPrice() * ps.get(i).getAmount());
				}
				System.out.println("판매 시 매출 : " + sum);
				
				
			} else if (menu == 3) {
				System.out.println("시스템을 종료합니다.");
				break;
			} else {
				System.out.println("올바른 숫자를 입력하세요.");
			}
		}

	}

}
