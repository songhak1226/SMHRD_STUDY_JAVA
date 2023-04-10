package 이차원배열;

import java.util.Scanner;

public class Ex04비정방형배열실습 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][] arr1 = new int[4][];
		int[] sum = new int[4];
		int num = 0;

		arr1[0] = new int[3];
		arr1[1] = new int[5];
		arr1[2] = new int[4];
		arr1[3] = new int[6];

		for (int i = 0; i < arr1.length; i++) {
			System.out.println((i + 1) + "반 점수 입력");
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print((i + 1) + "반 " + (j + 1) + "번째 학생 점수 >>");
				arr1[i][j] = sc.nextInt();
			}
		}

		sc.close();

		for (int i = 0; i < arr1.length; i++) {
			num = 0;
			System.out.print((i + 1) + "반 >> ");
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + "  ");
				num += arr1[i][j];
				for (int k = 0; k < sum.length; k++)
					sum[k] = num;
			}
			System.out.println();
			System.out.println("총점 : " + sum[i] + " / 평균 : " + (sum[i] / (double) arr1[i].length));
		}

	}

}
