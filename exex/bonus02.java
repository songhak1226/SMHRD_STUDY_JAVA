package exex;

public class bonus02 {

	public static void main(String[] args) {
		System.out.println(getMiddle("power"));
		System.out.println(getMiddle("test"));

	}

	public static String getMiddle(String a) {
		if (a.length() % 2 == 0) {
			return a.substring(a.length() / 2 - 1, a.length() / 2 + 1);
		} else {
			return a.substring(a.length() / 2, a.length() / 2 + 1);
		}
	}

}
