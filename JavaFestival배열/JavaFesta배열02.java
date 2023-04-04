package JavaFestival배열;

public class JavaFesta배열02 {

	public static void main(String[] args) {
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

	}

}
