import java.util.Random;
import java.util.Scanner;

public class Ex05PlusGame {

	public static void main(String[] args) {
		Random rd = new Random();
		/*
		 * rd.nextInt(); int num = rd.nextInt(10); //0~9까지 랜덤한 숫자 int num2 =
		 * rd.nextInt(10)+1; //1~10까지 랜덤한 숫자
		 * 
		 * System.out.println(rd.nextInt(10)); System.out.println(num);
		 * System.out.println(num2);
		 */

		// Random rd = new Random();

		rd.nextInt();
		int num3 = rd.nextInt(10);
		int num4 = rd.nextInt(10);

		Scanner sc = new Scanner(System.in);
		System.out.println("===Plus Game===");
		System.out.print(num3 + "+" + num4 + "=");
		int answer = sc.nextInt();
		int sum = num3 + num4;
		if (sum == answer) {
			System.out.println("Success");
		} else {
			System.out.println("Fail");
		}
		
		System.out.println("▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄\r\n"
				+ "█░░░░░░░░▀█▄▀▄▀██████░▀█▄▀▄▀██████░\r\n"
				+ "░░░░░░░░░░░▀█▄█▄███▀░░░ ▀██▄█▄███▀░\r\n"
				+ "");

		sc.close();
	}

}
