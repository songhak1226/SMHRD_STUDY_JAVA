package JavaFestival배열;

public class JavaFesta배열09 {

	public static void main(String[] args) {

		int[] point = { 92, 32, 52, 9, 81, 2, 68 };

		// 가장 거리가 가까운(최솟값) 인덱스 값을 찾아줘야 한다
		// 1. 기준값 만들기 point[0] - point[1]
		// Math.abs(point[0]-point[1])

		int min = Math.abs(point[0] - point[1]);

		// 배열의 인덱스 위치를 알 수 있는 변수 : 2개
		int num1 = 0;
		int num2 = 0; // 인덱스 값 2개 저장할 공간 : 가까운 거리를 가진

		// 비교해서 가까운 거리를 찾아라
		// 단, 자기 자신과 비교하면 값이 0이나옴 : x

		for (int i = 0; i < point.length; i++) {
			for (int j = 0; j < point.length; j++) {
				// i랑 j가 같은 숫자가 아닐때 아래 코드가 실행되게 만들자
				if (i != j) {
					if (Math.abs(point[i] - point[j]) < min) {
						min = Math.abs(point[i] - point[j]);
						num1 = i;
						num2 = j;
					}
				}
			}
		}
		System.out.println("result = [" + num1 + ", " + num2 + "]");

	}
}
