package MVC패턴;

public class Model {
	// Music 설계도 작성
	// VO(Value Object)

	private String songName; // 음악제목
	private String singer; // 가수이름
	private int playtime; // 음악길이(s)
	private String musicPath; // 음악파일경로

	public Model(String songName, String singer, int playtime, String musicPath) {
		this.songName = songName;
		this.singer = singer;
		this.playtime = playtime;
		this.musicPath = musicPath;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public int getPlaytime() {
		return playtime;
	}

	public void setPlaytime(int playtime) {
		this.playtime = playtime;
	}

	public String getMusicPath() {
		return musicPath;
	}

	public void setMusicPath(String musicPath) {
		this.musicPath = musicPath;
	}

}
