package 탐색;

public class Ex01순차검색 {

	public static void main(String[] args) {

		int[] arr = { 13, 35, 15, 11, 26, 72, 78, 13, 61, 90 };

		int num = 78; // 찾고 싶은 숫자

		// 순차검색 : 0~배열 끝 하나하나비교해서 찾는 방법
		// :정렬되어 있을 필요 없음

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) { //찾은 경우
				System.out.println(num + "은 " + i + "번 인덱스에 있습니다");
				break; //값이 중복되지 않는 경우에만 / 뒤쪽은 찾을필요 없음
			}
		}
	}

}
