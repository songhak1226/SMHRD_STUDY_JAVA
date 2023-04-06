package TV클래스설계;

public class TV클래스설계 {

	public static void main(String[] args) {
		// TV객체(object) 생성
		// 데이터타입 변수명 = new 데이터타입();
		
		TV tv1 = new TV();
		TV tv2 = new TV();
		
		tv1.브랜드이름 = "SAMSUNG";
		tv2.브랜드이름 = "LG";
		
		tv1.채널변경하기(30);
		tv1.채널내리기();
		
		System.out.println(tv1.채널);
	}

}
