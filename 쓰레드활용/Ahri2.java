package 쓰레드활용;

//2.Rannable 인터페이스 구현
public class Ahri2 implements Runnable {

	private String skill;

	public Ahri2(String key) {
		this.skill = key;
	}

	@Override
	public void run() {
		System.out.println("입력 키 : " + skill);
		
		for (int i = 1; i <= 3; i++) {
			System.out.println(skill + "사용중 : " + i + "s");
		}
		System.out.println(skill + " 스킬 사용 종료");

	}

}
