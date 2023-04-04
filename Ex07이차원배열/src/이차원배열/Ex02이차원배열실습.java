package 이차원배열;

public class Ex02이차원배열실습 {

	public static void main(String[] args) {

		int[][] arr1 = new int[5][5];

		int num = 25;
		for (int i = 4; i >= 0; i--) {
			for (int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = num--;
			}
		}

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();

		// 지그재그로 출력 1,2,3,4,5/10,9,8,7,6/11,12,13,14,15
		int[][] arr2 = new int[5][5];

		int num2 = 1;
		for (int i = 0; i < arr2.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < arr2[i].length; j++) {
					arr2[i][j] = num2++;
				}
			} else if (i % 2 == 1) {
				/*
				 * for (int j = 4; j >= 0; j--) { arr2[i][j] = num2++; }
				 */
				for (int j = 0; j < arr2[i].length; j++) {
					arr2[i][4 - j] = num2++;
				}
			}
		}

		// 출력
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
