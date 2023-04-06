package arrayList;

import java.util.ArrayList;

public class Ex02 {

	public static void main(String[] args) {
		
		//기본타입은 <> 지정할수 없음
		//<Reference Type>
		//int -> Integer
		//boolean -> Boolean
		//char -> Character
		ArrayList al = new ArrayList<Integer>();
		
		al.add(2); //0번 인덱스에 숫자 2 넣음
	}

}
