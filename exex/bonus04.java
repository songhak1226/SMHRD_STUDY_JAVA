package exex;

import java.util.Scanner;

public class bonus04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];

		for (int i = 0; i < 5; i++) {
			System.out.print(i + "번째 별의 수 : ");
			int num = sc.nextInt();
			arr[i] = num;

		}
		
		sc.close();
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ":");
			for (int j = 0; j < arr[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
