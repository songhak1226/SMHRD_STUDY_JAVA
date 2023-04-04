package exex;

import java.util.Random;
import java.util.Scanner;

public class ex29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int chance = 0;

		while (true) {
			int num1 = rd.nextInt(8) + 1;
			int num2 = rd.nextInt(8) + 1;
			int correct = num1 + num2;
			System.out.println(num1 + " + " + num2 + " = ");
			int answer = sc.nextInt();
			if (answer == correct) {
				System.out.println("SUCCESS!");
			} else {
				System.out.println("Fail...");
				chance++;
				if (chance == 5) {
					System.out.println("GAME OVER!");
					break;
				}
			}
		}
		sc.close();
	}

}
