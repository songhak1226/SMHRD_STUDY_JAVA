import java.util.Scanner;

public class Ex05배열과제답안 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 1.크기가 5인 정수형 데이터를 저장할 수 있는 배열 생성
		// -> 그 배열의 참조값(주소값)을 저장할 레퍼런스 변수 선언
		int[] score = new int[5];

		for (int i = 0; i < score.length; i++) {
			System.out.print(i + 1 + "번째 입력 >> ");
			score[i] = sc.nextInt();
		}
		sc.close();

		System.out.println("입력된 점수 : ");
		// 일반 for문
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + " ");
		}
		System.out.println();

		// 확장 for문(for~each문)
		// : 배열, List구조에서 쓰일 수 있는 반복문
		// for(배열의 0번 인덱스에 있는 값부터 임시로 저장할 변수 : 배열의 레퍼런스변수 이름)
		for (int a : score) { //그냥 배열0번부터 a에 넣어주는 느낌
			// a에 score[0]의 값을 넣고 출력, 다음 for문 돌았을때
			// a에 score[1]의 값을 넣고 출력 <- 이렇게 배열 끝까지 반복
			System.out.print(a + " ");
		}
		System.out.println();

		int max = score[0];
		int min = score[0];
		int sum = 0;

		for (int a : score) {
			sum += a;
			if (max < a) { // 최고점수
				max = a;
			}
			if (min > a) { // 최저점수
				min = a;
			}
		}
		
		System.out.println("최고점수 : " + max);
		System.out.println("최저점수 : " + min);
		System.out.println("총합 : " + sum);
		System.out.printf("평균 : %.2f", sum/(double)score.length);
		
		
	}

}
