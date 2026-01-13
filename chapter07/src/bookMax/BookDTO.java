package bookMax;

import java.text.DecimalFormat;

public class BookDTO {
//	멤버변수 
//	접근 제어자 private 사용
//	private 은 자기 자신 클래스에서는 접근할 수 있다.
	private String bookTitle;  // 책 제목
	private String author;  // 저자
	private int price;  // 가격
	
//	기본 생성자
	public BookDTO() {}
	
//	매개변수 생성자
	public BookDTO(String bookTitle, String author, int price) {
		this.bookTitle = bookTitle;
		this.author = author;
		this.price = price;
	}
	
//	접근 제어가 다른곳에서 사용 가능하게
	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	//	출력
	public void bookList() {
		DecimalFormat num = new DecimalFormat("#,##0원");
		System.out.println("제목 : " + bookTitle + "\t 저자 : " + author + "\t 가격 : " + num.format(price));
	}
}
