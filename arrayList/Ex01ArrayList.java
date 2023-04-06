package arrayList;

import java.util.ArrayList;

public class Ex01ArrayList {

	public static void main(String[] args) {

		// 1. ArrayList 생성 -> heap
		// -> ArrayList 생성된 참조값 저장 -> 참조변수(레퍼런스 변수) 선언
		ArrayList<String> al = new ArrayList<String>();
		// ArrayList<E>(초기 크기 -> 생략가능(10));

		// 2. 요소 삽입
		al.add("Hello"); // 어레이리스트의 0번
		al.add("Hi"); // 1번에 자동으로 넣어줌
		al.add("Java"); // 2번에 자동으로 넣어줌

		// 3. 요소 개수
		// al.size() -> 크기랑은 상관없이 삽입한 요소의 개수를 반환해줌
		System.out.println(al.size());

		// 4. 요소 중간 삽입
		al.add(1, "Python");
		System.out.println(al.size());

		// 5. 특정 인덱스에 있는 요소 알아내기
		// al.get(0)괄호안에 있는 인덱스번호 값을 반환
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		System.out.println(al.get(2));
		System.out.println(al.get(3));

		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}

		for (String s : al) {
			System.out.println(s);
		}

		// 6. 특정 요소 삭제
		al.remove(2);
		System.out.println(al.size());

		// 7. 모든 요소 삭제
		al.clear();
		System.out.println(al.size());
	}

}
