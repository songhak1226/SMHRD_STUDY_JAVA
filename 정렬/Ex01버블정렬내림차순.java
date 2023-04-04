package 정렬;

import java.util.Arrays;

public class Ex01버블정렬내림차순 {

	public static void main(String[] args) {

		// int[] arr = { 10, 24, 7, 68, 42, 82, 3, 43 };
		int[] arr = { 1, 2, 7, 68, 42, 82, 53, 43 };

		System.out.println("정렬 전 : " + Arrays.toString(arr));

		int temp = 0; // 치환을 위한 임시 공간
		// 1회차
		// 0-1/1-2/2-3/3-4/4-5/5-6/6-7

		// 2회차
		// 0-1/1-2/2-3/3-4/4-5/5-6

		boolean a = false; // 정렬이 한번이라도 일어나면 true

		for (int j = 0; j < arr.length - 1; j++) {
			a = false;
			for (int i = 0; i < arr.length - 1 - j; i++) {
				if (arr[i] < arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					a = true;
				}
			}
			if (a == false) { // a가 false 일때만 수행 (n회차 한번도 바뀌지 않았을 때
				break;
			}
			System.out.println(j + 1 + "회차 : " + Arrays.toString(arr));
		}

	}

}
