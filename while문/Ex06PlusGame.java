import java.util.Random;
import java.util.Scanner;

public class Ex06PlusGame {

	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);	

		System.out.println("===Plus Game===");
		
		String input = null;
		
		int chance = 3;

		while (true) {
			int num3 = rd.nextInt(50)+1;
			int num4 = rd.nextInt(50)+1;
			int sum = num3 + num4;
			System.out.print(num3 + "+" + num4 + "=");
			int answer = sc.nextInt();
			
			if (sum == answer) {
				System.out.println("success");
			} else {
				System.out.println("fail");
				chance--;
				if(chance == 0) {
					System.out.println("종료합니다.");
					break;
				}
				System.out.println("계속 하시겠습니까? >> ");
				input = sc.next();
				if (input.equals("Y")) {

				} else {
					if (input.equals("N")) {
						System.out.println("종료합니다.");
						break;
					}
				}
			}
		}

		sc.close();

	}

}
