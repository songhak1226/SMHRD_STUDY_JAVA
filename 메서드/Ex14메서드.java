package 메서드;

public class Ex14메서드 {

	public static void main(String[] args) {
		System.out.println(getMiddle("power"));
		System.out.println(getMiddle("test"));

		// 전달인자 : String 1개
		// 매개변수 : String 1개
		// 리턴타입 : String

	}

	public static String getMiddle(String name) {
		if (name.length() % 2 == 0) {
			return name.substring(name.length() / 2 - 1, name.length() / 2 + 1);
		} else {
			return name.substring(name.length() / 2, name.length() / 2 + 1);
		}
	}

}
