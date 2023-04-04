package 이차원배열;

public class Ex03비정방형배열생성 {

	public static void main(String[] args) {

		// 비정방형배열생성
		// 1. 이차원배열 레퍼런스 배열과 변수 생성 및 선언
		int[][] arr1 = new int[5][];
		// 각 일차원배열의 길이가 다르기 떄문에 레퍼런스 배열 생성 시
		// 길이를 지정할 수 없음 -> 비워둠

		arr1[0] = new int[1]; // 일차원배열 생성후 레퍼런스 값을 레퍼런스 배열에 저장
		arr1[1] = new int[2];
		arr1[2] = new int[3];
		arr1[3] = new int[1];
		arr1[4] = new int[3];

		arr1[0][0] = 10;

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
