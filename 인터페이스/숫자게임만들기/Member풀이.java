package 숫자게임만들기;

public class Member풀이 {

	// 닉네임, 비밀번호 저장
	private String nick;
	private String pw;

	// 생성자
	public Member풀이(String nick, String pw) {
		this.nick = nick;
		this.pw = pw;
	}

	// getter/setter
	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

}
