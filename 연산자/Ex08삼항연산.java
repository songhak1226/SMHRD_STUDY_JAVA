import java.util.Scanner;

public class Ex08삼항연산 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("농구공의 개수를 입력하세요 : ");

		int ball = sc.nextInt();
		int ans = ((ball % 5 == 0) ? (ans = ball / 5) : (ans = (ball / 5) + 1));

		System.out.println("필요한 상자의 수 : " + ans);
		
		sc.close();
	}

}
