package 쓰레드활용;

//동시에 여러 스킬을 사용할 수 없음
//사용한 스킬이 완료되기 전까지는 다른 스킬을 사용할 수 없음 -> 단일 쓰레딩
public class Blitzcrank {
	
	private String skill;

	public Blitzcrank(String key) {
		this.skill = key;
	}

	// Thread 클래스 => run 메서드 오버라이딩
	// run -> 실제 실행할 기능 정의, 하나의 쓰레드가 수행할 한가지 작업
	// -> 쓰레드 시작, 종료 -> 쓰레드 종료
	public void run() {
		System.out.println("입력 키 : " + skill);
		for (int i = 1; i <= 3; i++) {
			System.out.println(skill + "사용중 : " + i + "s");
		}
		System.out.println(skill + " 스킬 사용 종료");
	}
	

}
