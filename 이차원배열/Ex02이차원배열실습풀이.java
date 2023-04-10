package 이차원배열;

public class Ex02이차원배열실습풀이 {

	public static void main(String[] args) {
		int[][] arr1 = new int[5][5];

		int num = 1;

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				arr1[i][4 - j] = num++;
			}
		}

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
