import java.util.Random;

public class Ex04배열실습 {

	public static void main(String[] args) {

		// 배열을 랜덤값으로 초기회

		Random rd = new Random();

		int[] arr = new int[10];
		// 정수 배열을 선언 (기본값 : 0)
		// int min = arr[0]; 여기서 선언을 하면 min값에는 0이 들어가버림
		// 그래서 밑에서 선언을 해줘야 함

		for (int i = 0; i < arr.length; i++) { // 배열값 랜덤으로 초기화
			arr[i] = rd.nextInt(20) + 1;
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		
		int max = arr[0]; // 변수 선언을 여기서 하는 이유
							// 바로 윗 구문에서 배열값을 초기화하고 나서 선언을 해야
							// 0이아닌 랜덤한 숫자가 들어갈 수 있기 때문
		int min = arr[0];

		
		for (int i = 1; i < arr.length; i++) { // i = 1부터 시작하는 이유 : max값이 arr[0]값이라 비교할필요 없음
			if (max < arr[i]) { // arr[i]값이 max(arr[0]값 보다 크면
				max = arr[i]; // max값을 arr[i]값으로 바꿔줌
			}
			if (min > arr[i]) { // arr[i]값이 max(arr[0]값 보다 작으면
				min = arr[i]; // max값을 arr[i]값으로 바꿔줌
			}
		}

		System.out.println("최대 값 : " + max);
		System.out.println("최소 값 : " + min);

		// 모르겠따

	}

}
