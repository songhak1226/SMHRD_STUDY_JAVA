import java.util.Scanner;

public class ExQuiz5_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String ID = null;
		String PW = null;
		int num = 3;
		

		while (true) {
			System.out.print("아이디 : ");
			ID = sc.next();
			System.out.print("비밀번호 : ");
			PW = sc.next();
			if (ID.equals("smhrd")&&PW.equals("1234")) {
				System.out.println("로그인 성공!");
				break;
			}else {
				System.out.println("로그인 실패");
				num--;
				if(num==0) {
					break;
				}
			}
			
		}

		sc.close();

	}

}
