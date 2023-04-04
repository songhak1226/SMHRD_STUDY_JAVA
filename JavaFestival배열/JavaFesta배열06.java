package JavaFestival배열;

import java.util.Random;

public class JavaFesta배열06 {

	public static void main(String[] args) {
		Random rd = new Random();

		int[] arr = new int[6];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(45) + 1;
			for(int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
					break;
				}
			}
			System.out.println("행운의 숫자 : " + arr[i]);

		}

	}

}
