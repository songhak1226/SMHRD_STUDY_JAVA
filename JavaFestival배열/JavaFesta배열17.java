package JavaFestival배열;

import java.util.Scanner;

public class JavaFesta배열17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("입력 >> ");
		String input = sc.nextLine();
		// nextLine() : Enter를 칠때까지 문자열을 리턴
		// next() : space를 칠때까지 문자열을 리턴

		// a~z : 26개
		// 알파벳 빈도수가 저장될 int[26] 배열 만들기
		int[] arr = new int[26];

		// 출력문 : 입력 (s)
		// replace(" ","").toLowerCase();
		// 문자열(s) -> 문자(char) : 쪼개
		// charAt(index)-> 아스키코드(int)
		// a : 97 ~ z : 122

		input = input.replace(" ", "").toLowerCase();

		System.out.println(input);

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			arr[c - 97]++;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println((char) (i + 97) + ":" + arr[i]);
		}
		// a : 0번째 인덱스에 값이 +1
		// b : 1인덱스에 값이 +1
		// s.length() 반복횟수

		// 출력하기 빈도수가 저장되어있는 배열 출력
		
		sc.close();
	}

}
