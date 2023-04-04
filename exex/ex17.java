package exex;

import java.util.Scanner;

public class ex17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = 0;
		int[] arr = new int[10];
		
		
		for (int i = 0; i < 10; i++) {
			System.out.print(i + 1 + "번 째 정수 입력 >> ");
			int input = sc.nextInt();
			if (input % 3 == 0) {
				arr[num] = input;
				num++;
			}
		}
		
		sc.close();
		
		

		System.out.print("3의 배수 : ");
		for (int j = 0; j < num; j++) {
			System.out.print(arr[j] + " ");
		}

	}

}
