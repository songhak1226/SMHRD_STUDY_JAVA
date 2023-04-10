package 도서관리프로그램;

//책을 표현하는 클래스(책 정보를 가지고 있음)
public class BookData {
	
	private String title;
	private int price;
	private String writer;
	
	//생성자
	public BookData(String title, int price, String writer) {
		super();
		this.title = title;
		this.price = price;
		this.writer = writer;
	}


	public String getTitle() {
		return title;
	}


	public int getPrice() {
		return price;
	}


	public String getWriter() {
		return writer;
	}
	
	

}

