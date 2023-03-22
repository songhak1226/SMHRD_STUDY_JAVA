
public class Ex11치환 {

	public static void main(String[] args) {
		
		String left = "red";
		String right = "blue";
		
		
		//String temp;  //임시 저장공간 선언 but 초기화를 안함(이전에 썻던 값이 남아있을 수 있음)
		String temp = null;  //초기화 함 -> reference type만 가능
		
		temp = left;
		left = right;
		right = temp;
		
		
		System.out.println(left);   //blue
		System.out.println(right);  //red

	}

}
