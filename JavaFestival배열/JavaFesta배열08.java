package JavaFestival배열;

import java.util.Scanner;

public class JavaFesta배열08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[10];

		System.out.println("숫자 입력 >> ");
		int num = sc.nextInt();
		// 2진수를 구해서 배열에 저장
		// ex) 8을 2로 나눠서 나머지값 배열에 저장
		// 위에 나누기한 몫을 2로 나눠서 나머지값 배열에 저장

		int i = 0;
		while (num >= 2) {
			// index
			arr[i] = num % 2;
			// num을 2로 나누기
			num = num / 2;
			// num을 2로 나눠서 나온 나머지값을 배열에 저장
			i++;
		}
		
		arr[i] = num;
		
		for(int j = i; j >=0; j--) {
			System.out.print(arr[j] + " ");
		}
		
		sc.close();

	}

}
