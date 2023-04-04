package exex;

import java.util.Scanner;

public class ex25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = { 6, 2, 5, 5, 4, 5, 6, 3, 7, 6 };

		int num = 0;

		System.out.print("첫자리 0을 제외한 숫자를 입력해주세요 >> ");
		int input = sc.nextInt();

		sc.close();

		while (input > 0) {
			num += arr[input % 10];
			input /= 10;
		}

		System.out.println("대시('_')의 총 합 >> " + num);

	}

}
