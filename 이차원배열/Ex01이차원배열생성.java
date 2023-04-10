package 이차원배열;

public class Ex01이차원배열생성 {

	public static void main(String[] args) {

		int[][] arr = new int[3][5]; // 배열 생성시 크기 무조건 지정
		// 일차원 배열 3개 -> 5칸(길이 5)
		// 레퍼런스배열 1개 - > 길이 3
		// -> 3행 5열 행렬 구조
		// int형 배열 -> 초기화를 하지 않으면 기본 0

		arr[0][0] = 10;
		// arr[0] = 1; -> 레퍼런스 배열 초기화는 불가능
		System.out.println(arr[0][2]);

		char[][] charArr = { { 'a', 'b', 'c' }, { 'd', 'e', 'f' } };
		System.out.println(charArr.length); // 2 : 레퍼런스 배열의 길이
											// 1차원 배열이 몇개? 2
		System.out.println(charArr[0].length); // 3 : 1차원 배열의 길이? 3

		int[][] arr2 = new int[5][5];

		int num = 1;
		for (int j = 0; j < arr2.length; j++) { // 반복 -> 1개의 행을 다룬다
			for (int i = 0; i < arr2[j].length; i++) { // 1차원배열 하나 초기화
														// 1개의 행의 각(실제)데이터를 다룬다
				arr2[j][i] = num++;
			}
		}

		for (int j = 0; j < arr2.length; j++) { // 반복
			for (int i = 0; i < arr2[j].length; i++) { // 1차원배열 하나 초기화
				System.out.print(arr2[j][i] + "\t");
			}
			System.out.println();
		}
		System.out.println();

		int[][] arr3 = new int[4][6];

		int num2 = 21;
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j++) {
				arr3[i][j] = num2++;
				System.out.print(arr3[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
