
public class Ex01while문 {

	public static void main(String[] args) {
		
		//반복문
		//1. while(do~while) : 특정 조건에 해당할 경우에만 반복(반복횟수가 정확하지 않은 경우)
		//2. for : 반복횟수가 정해진 경우
		/*
		 * while(조건식){
		 * 		실행문장
		 * }
		 */
		int n = 1;
		//while({문장}을 반복할 조건)
		while(n<=5) {
			// 반복하고 싶은 문장
			System.out.println(n);  //변수 (값이 바뀌어야 함)
			n++;
			System.out.println(n);
		}
		//지역변수 : 특정 구역에서만 사용 가능한 값(어디까지만 사용 가능한지 파악해야 함
		//전역변수 : 어디에서든 사용 가능한 값
		
		
		//같은 변수 한번에 다 바꾸기
		// 바꾸려는 변수 뒤에 클릭하고 alt + shift + r
		int n1 = 1;
		while(n1<=5) {
			System.out.println(n1++);
		}
		
		int n2 = 1;
		while(true) { //반복을 그만할 조건 //무조건 반복만 하게 (무한반복)
			System.out.println(n2++);
			//반복문을 나갈 조건
			if(n2==6) {//반복문 나갈거냐고 물어봄
				break; //switch, 반복문(while,for)을 나가게 하는 키워드
				       // -> break를 기준으로 가장 가까운 반복문만 나감
			}
		}
		
		
		/*do while문
		 * do{
		 * 		실행문장
		 * } while(조건식);
		 */
		//do while문은 무조건 한번은 실행
		// 반복 문장을 무조건 1번은 실행해야 할 때!
		
		int n3 = 1;
		do {
			System.out.println(n3++);
		} while(n3 <= 5);
		
		

	}

}
