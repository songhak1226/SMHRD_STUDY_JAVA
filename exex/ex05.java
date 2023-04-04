package exex;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("행 개수 :");
		int num = sc.nextInt();
		
		sc.close();

		for (int i = 0; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
