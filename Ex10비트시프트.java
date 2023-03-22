
public class Ex10비트시프트 {

	public static void main(String[] args) {

		// 비트 연산자, 시프트 연산자 -> 연산을 빠르게 하고 싶을 때 ex)은행
		//int a = 9; // 10진수 -> 2진수

		// 비트연산자 : &(and), |(or), ^(xor), ~(not)
		// 논리연산자 &&, || 이런거와는 다르게 하나만 씀
		int b = 9; // 1001
		int c = 11; // 1011

		// 비트연산은 2진수로 계산함
		System.out.println(b & c); // 같은 자리 수가 하나라도 0이면 false(0)
		System.out.println(b | c); // 같은자리수가 하나라도 1이면 true(1)
		System.out.println(b ^ c); // 같은 자리 수가 같으면 false(0) 다르면 true(1)

		int d = 6; // 0110
		System.out.println(~d); // 1의보수

		// 시프트 연산 : 비트(0,1)를 옮겨주는 연산
		// <<(비트가 왼쪽으로 옮겨짐), >>(비트가 오른쪽으로 옮겨짐)
		System.out.println(3<<2);  //2진수 3을 비트를 왼쪽으로 2칸씩 움직인다.
		//00000011 -> 00001100 이 돼서 3이 12로 바뀜
		
	}

}
