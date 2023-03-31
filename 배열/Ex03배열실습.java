
public class Ex03배열실습 {

	public static void main(String[] args) {

		// 1. 크기가 10인 배열 생성 원하는 값으로 초기화

		int[] arr = { 1, 12, 35, 41, 62, 47, 68, 88, 74, 98 };

		// 2. 배열의 값중 홀수만 출력, 홀수가 몇개인지 출력
		int count = 0;
		System.out.print("배열 홀수 : ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 1) {
				System.out.print(arr[i] + " ");
				count++;
			}
		}
		System.out.println();
		System.out.println("총 개수 : " + count + "개");

	}

}
