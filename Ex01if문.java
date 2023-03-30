import java.util.Scanner;

public class Ex01if문 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이 입력 : ");
		int age = sc.nextInt();
		
		//if(조건식 : 결과값이 true or false (boolean))
		//     -> 비교연산자, 논리연산자
		if(age >= 20) {
			System.out.println("성인입니다.");
		}
		
		System.out.println("맨 아랫줄!");
		/*
		if(true) {
			
		}
		//dead code : 절대 실행 안되는 코드(의미가 없는 코드)
		if(false) {
			
		}
		*/
		sc.close();

	}

}
