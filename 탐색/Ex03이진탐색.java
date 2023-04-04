package 탐색;

import java.util.Arrays;

public class Ex03이진탐색 {

	public static void main(String[] args) {

		int[] arr = { 10, 24, 7, 68, 42, 82, 3, 43, 22, 84 };

		// Arrays.sort(array); // arr 배열안에 값을 정렬해서 저장(오름차순)

		// System.out.println(Arrays.toString(array));

		int temp;
		int index;

		for (int i = 0; i < arr.length - 1; i++) {
			index = i;
			for (int j = i; j < arr.length; j++) {
				if (arr[index] > arr[j]) {
					index = j;
				}
			}
			if (i != index) {
				temp = arr[index];
				arr[index] = arr[i];
				arr[i] = temp;
			}
		}
		System.out.println(Arrays.toString(arr));
		
		//이진탐색 : 배열에 있는 데이터가 꼭 정렬이 되어있어야 한다

		int lowIndex = 0;
		int highIndex = arr.length - 1;
		int num = 68;

		while (true) {
			int middleIndex = (lowIndex + highIndex) / 2;
			if (arr[middleIndex] == num) {
				System.out.println(middleIndex);
				break;
			} else {
				if (arr[middleIndex] > num) {
					highIndex = middleIndex - 1;
				} else {
					lowIndex = middleIndex + 1;
				}
			}
		}

	}

}
